package chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author Administrator
 *
 */
public class Client {
	/*
	 * 封装了TCP协议的通讯句柄
	 */
	private Socket socket;
	/*
	 * 构造方法，用来初始化客户端
	 */
	public Client() throws Exception{
		try {
			/*
			 * 创建Socket的同时需要指定服务端的IP地址和端口号，
			 * IP：可以通过IP找到服务器的计算机
			 * 端口：找到服务器上运行的服务端应用程序
			 */
			socket = new Socket("192.168.1.22",8088);
		} catch (Exception e) {
			System.out.println("连接服务器失败！");
			throw e;
		}
	}
	/*
	 * 客户端开始工作的方法
	 */
	public void start(){
		try {
			//启动接受服务端消息的线程
			ServerHandler handler =new ServerHandler();
			Thread t=new Thread(handler);
			t.start();
			
			Scanner scan =new Scanner(System.in);
			/*
			 * 若想将数据发送至远端计算机，我们需要通过Socket获取输出流
			 * 并通过该流将数据写出即可
			 * 
			 * Socket  定了获取输出流的方法
			 * OutputStream getOutputStream()
			 */
			//OutputStream是所有输出流的父类
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			System.out.println("请输入说话内容：");
			String message=null;
			while(true){
				message=scan.nextLine();
				pw.println(message);
			}		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			Client client=new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * 该线程用来循环接受服务端发出来的每一行
	 */
	private class ServerHandler implements Runnable{
		public void run(){
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
				BufferedReader br=new BufferedReader(isr);
				String message=null;
				while((message=br.readLine())!=null){
					/*
					 * 将服务端发送过来的内容输出到控制台
					 */
					System.out.println(message);
				}
				
			} catch (Exception e) {
				
			}
		}
	}
}
