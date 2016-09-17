package com.dms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * DMS 服务端
 * 负责接收所有的客户端发送过来的配对日志
 * 并保存在服务端
 * @author Administrator
 *
 */
public class DMSServer {
	//运行在服务端的ServerSocket
	private ServerSocket server;
	
	//使用线程池来管理与客户端交互线程
	private ExecutorService threadPool;
	
	//用于保存所有客户端发送过来的配对文件
	private File serverLogFile;
	
	//消息队列，用于存储客户端发送的配对日志
	private BlockingQueue<String> messageQueue;
	/**
	 * 初始化客户端
	 * @throws Exception
	 */
	public DMSServer() throws Exception{
		try {
			server =new ServerSocket(8088);
			threadPool=Executors.newFixedThreadPool(30);
			serverLogFile=new File("server_logs.txt");
			//双缓冲队列-----------------------------------------------*******
			messageQueue=new LinkedBlockingQueue<String>();
		} catch (Exception e) {
			System.out.println("服务端初始化失败！");
			throw e;
		}
	}
	public void start() throws Exception{
		try {
			//将保存日志的线程启动起来
			SavaLogHandler savaHandler=new SavaLogHandler();
			Thread t=new Thread(savaHandler);
			t.start();
			
			
			while(true){
				Socket socket=server.accept();
				ClientHandler clientHandler=new ClientHandler(socket);
				threadPool.execute(clientHandler);
				
			}
		} catch (Exception e) {
			System.out.println("服务端运行失败");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			DMSServer server=new DMSServer();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * 该线程的作用是从消息队列取出每一条配对的日志
	 * 并存入到serverLogFile中保存
	 */
	private class SavaLogHandler implements Runnable{
		public void run(){
			PrintWriter pw=null;
			try {
				//增加true，向文件中追加
				pw=new PrintWriter(new FileOutputStream(serverLogFile,true));
				while(true){
					if(messageQueue.size()>0){
						String log=messageQueue.poll();
						pw.println(log);
					}else{
						pw.flush();
						Thread.sleep(500);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(pw!=null){
					pw.close();
				}
			}
		}
	}
	/*
	 * 该线程主要负责接收指定客户端发送过来的所有配对日志
	 * 并保存服务端，然后给予客户端回应
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		public ClientHandler(Socket socket){
			this.socket=socket;
		}
		public void run(){
			PrintWriter pw=null;
			try {
				pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
				/*
				 * 当客户端连接后，首先获取输入流
				 * 读取客户端发来的所有配对日志
				 * 并写入文件中保存、 然后创建输出流
				 * 回应客户端
				 * 步骤：
				 * 1：通过Socket获取输入流，并包装为BufferedReader
				 * 2：循环读取客户端发送过来的每一条配对日志
				 *    知道读取”OVER“，并将每一条日志写入到文件
				 *    中保存
				 * 3：通过Socket获取输出流，并包装为PrintWriter
				 * 4：向客户端回应”OK“
				 */
				//1
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				
				//2
				String log=null;
				while((log=br.readLine())!=null){
					if("OVER".equals(log)){
						break;
					}
					//将该日志写入到serverlogFile中
					messageQueue.offer(log);
				}
				//3 在try下面完成了
				
				//4
				pw.println("ok");
				pw.flush();
				
				
			} catch (Exception e) {
				if(pw!=null){
					pw.println("ERROR!");
					pw.flush();
				}
				
			}finally{
				//客户端断开连接了
				if(socket!=null){
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
