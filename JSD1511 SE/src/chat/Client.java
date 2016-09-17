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
	/*
	 * ���췽����������ʼ���ͻ���
	 */
	public Client() throws Exception{
		try {
			/*
			 * ����Socket��ͬʱ��Ҫָ������˵�IP��ַ�Ͷ˿ںţ�
			 * IP������ͨ��IP�ҵ��������ļ����
			 * �˿ڣ��ҵ������������еķ����Ӧ�ó���
			 */
			socket = new Socket("192.168.1.22",8088);
		} catch (Exception e) {
			System.out.println("���ӷ�����ʧ�ܣ�");
			throw e;
		}
	}
	/*
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start(){
		try {
			//�������ܷ������Ϣ���߳�
			ServerHandler handler =new ServerHandler();
			Thread t=new Thread(handler);
			t.start();
			
			Scanner scan =new Scanner(System.in);
			/*
			 * ���뽫���ݷ�����Զ�˼������������Ҫͨ��Socket��ȡ�����
			 * ��ͨ������������д������
			 * 
			 * Socket  ���˻�ȡ������ķ���
			 * OutputStream getOutputStream()
			 */
			//OutputStream������������ĸ���
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			System.out.println("������˵�����ݣ�");
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
	 * ���߳�����ѭ�����ܷ���˷�������ÿһ��
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
					 * ������˷��͹������������������̨
					 */
					System.out.println(message);
				}
				
			} catch (Exception e) {
				
			}
		}
	}
}
