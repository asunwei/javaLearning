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
 * �����ҿͻ���
 * @author Administrator
 *
 */
public class Client {
	/*
	 * ��װ��TCPЭ���ͨѶ���
	 */
	private Socket socket;
	/**
	 * ���췽����������ʼ���ͻ���
	 * @throws Exception 
	 */
	public Client() throws Exception{
		try {
			/*
			 * ����Socket��ͬʱ��Ҫָ��
			 * ����˵�IP��ַ��˿ں�
			 * IP:����ͨ��IP�ҵ��������ļ����
			 * �˿�:�ҵ������������еķ����Ӧ��
			 *     ����
			 *     
			 * ʵ����Socket�Ĺ��̾��Ƿ������ӵ�
			 * ���̡�    
			 * 
			 * /sbin/ifconfig
			 */
			socket = new Socket(
				"localhost",8088);
		} catch (Exception e) {
			System.out.println("���ӷ����ʧ��!");
			throw e;
		}
	}
	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start(){
		try {
			//�������շ������Ϣ���߳�
			ServerHandler handler
				= new ServerHandler();
			Thread t = new Thread();
			t.start();
			
			
			Scanner scanner 
				= new Scanner(System.in);
			
			/*
			 * �������ݷ�����Զ�˼������������Ҫ
			 * ͨ��Socket��ȡ���������ͨ��������
			 * ����д�����ɡ�
			 * Socket�����˻�ȡ������ķ�����
			 * OutputStream getOutputStream()
			 */
			OutputStream out 
				= socket.getOutputStream();
			
			OutputStreamWriter osw
				= new OutputStreamWriter(
					out,"UTF-8"	
				);
			
			PrintWriter pw
				= new PrintWriter(osw,true);
			
			String message = null;
			while(true){
				message = scanner.nextLine();
				pw.println(message);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���߳�����ѭ�����շ���˷��͹�����ÿһ��
	 * ������Ϣ
	 * @author Administrator
	 *
	 */
	private class ServerHandler 
					implements Runnable{
		public void run(){
			try {
				InputStream in
					= socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(
						in,"UTF-8"	
					);
				BufferedReader br
					= new BufferedReader(isr);
				
				String message = null;
				while((message = br.readLine())!=null){
					/*
					 * ������˷��͹������������������̨
					 */
					System.out.println(message);
				}
				
			} catch (Exception e) {
				
			}
		}
	}
	
}







