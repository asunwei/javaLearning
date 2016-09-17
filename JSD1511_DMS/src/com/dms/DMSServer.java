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
 * DMS �����
 * ����������еĿͻ��˷��͹����������־
 * �������ڷ����
 * @author Administrator
 *
 */
public class DMSServer {
	//�����ڷ���˵�ServerSocket
	private ServerSocket server;
	
	//ʹ���̳߳���������ͻ��˽����߳�
	private ExecutorService threadPool;
	
	//���ڱ������пͻ��˷��͹���������ļ�
	private File serverLogFile;
	
	//��Ϣ���У����ڴ洢�ͻ��˷��͵������־
	private BlockingQueue<String> messageQueue;
	/**
	 * ��ʼ���ͻ���
	 * @throws Exception
	 */
	public DMSServer() throws Exception{
		try {
			server =new ServerSocket(8088);
			threadPool=Executors.newFixedThreadPool(30);
			serverLogFile=new File("server_logs.txt");
			//˫�������-----------------------------------------------*******
			messageQueue=new LinkedBlockingQueue<String>();
		} catch (Exception e) {
			System.out.println("����˳�ʼ��ʧ�ܣ�");
			throw e;
		}
	}
	public void start() throws Exception{
		try {
			//��������־���߳���������
			SavaLogHandler savaHandler=new SavaLogHandler();
			Thread t=new Thread(savaHandler);
			t.start();
			
			
			while(true){
				Socket socket=server.accept();
				ClientHandler clientHandler=new ClientHandler(socket);
				threadPool.execute(clientHandler);
				
			}
		} catch (Exception e) {
			System.out.println("���������ʧ��");
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
	 * ���̵߳������Ǵ���Ϣ����ȡ��ÿһ����Ե���־
	 * �����뵽serverLogFile�б���
	 */
	private class SavaLogHandler implements Runnable{
		public void run(){
			PrintWriter pw=null;
			try {
				//����true�����ļ���׷��
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
	 * ���߳���Ҫ�������ָ���ͻ��˷��͹��������������־
	 * ���������ˣ�Ȼ�����ͻ��˻�Ӧ
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
				 * ���ͻ������Ӻ����Ȼ�ȡ������
				 * ��ȡ�ͻ��˷��������������־
				 * ��д���ļ��б��桢 Ȼ�󴴽������
				 * ��Ӧ�ͻ���
				 * ���裺
				 * 1��ͨ��Socket��ȡ������������װΪBufferedReader
				 * 2��ѭ����ȡ�ͻ��˷��͹�����ÿһ�������־
				 *    ֪����ȡ��OVER��������ÿһ����־д�뵽�ļ�
				 *    �б���
				 * 3��ͨ��Socket��ȡ�����������װΪPrintWriter
				 * 4����ͻ��˻�Ӧ��OK��
				 */
				//1
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				
				//2
				String log=null;
				while((log=br.readLine())!=null){
					if("OVER".equals(log)){
						break;
					}
					//������־д�뵽serverlogFile��
					messageQueue.offer(log);
				}
				//3 ��try���������
				
				//4
				pw.println("ok");
				pw.flush();
				
				
			} catch (Exception e) {
				if(pw!=null){
					pw.println("ERROR!");
					pw.flush();
				}
				
			}finally{
				//�ͻ��˶Ͽ�������
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
