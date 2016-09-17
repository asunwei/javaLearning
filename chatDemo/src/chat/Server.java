package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * �����ҷ����
 * @author Administrator
 *
 */
public class Server {
	/*
	 * �����ڷ���˵�Socket
	 * ��Ҫ����:
	 * 1:�������˶˿ڣ��ͻ��˾��Ǹ��ݸö˿�
	 *   �����Ϸ���˵�
	 * 2:�����˿ڣ�һ���ͻ���ͨ���ö˿����Ӻ�
	 *   �ʹ���һ��Socket��ÿͻ��˽��н�����  
	 */
	private ServerSocket server;
	/*
	 * �������пͻ���������ļ��ϣ����ڹ㲥��Ϣʹ��
	 */
	private List<PrintWriter> allOut;
	
	public Server() throws Exception{
		try {
			server = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
		} catch (Exception e) {
			System.out.println("����˳�ʼ��ʧ��!");
			throw e;
		}
	}
	/**
	 * ����������������빲������
	 * @param pw
	 */
	private synchronized void addOut(PrintWriter pw){
		allOut.add(pw);
	}
	/**
	 * ��������������ӹ�������ɾ��
	 * @param pw
	 */
	private synchronized void removeOut(PrintWriter pw){
		allOut.remove(pw);
	}
	/**
	 * �����������е�ÿһ�����������������Ϣ
	 * ���ͳ�ȥ�����й㲥����
	 * @param message
	 */
	private synchronized void sendMessage(String message){
		for(PrintWriter pw : allOut){
			pw.println(message);
		}
	}
	
	
	
	public void start() throws Exception{
		try {
			/*
			 * ����8088�˿ڣ��ȴ��ͻ�������
			 * Socket accept()
			 * �÷�����һ������������ֱ��һ���ͻ���
			 * ͨ���ö˿�����Ϊֹ�������һֱ������
			 * �����Ӻ󣬻��Զ���ȡһ��Socket��ͨ��
			 * ���Socket�Ϳ�����������ϵĿͻ��˽�
			 * ��ͨѶ�ˡ�
			 * ��ϣ���ٴν��������ͻ��˵����ӣ���Ҫ
			 * �ٴε��ø÷�����
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("һ���ͻ���������!");
				/*
				 * ��һ���ͻ������Ӻ�����һ���߳�ClientHandler
				 * ��������ÿͻ��˵Ľ���������
				 */
				ClientHandler handler
					= new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
				
			}
			
		} catch (Exception e) {
			System.out.println("����������쳣!");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���߳����������ָ���ͻ��˽����Ĺ���
	 * @author Administrator
	 *
	 */
	private class ClientHandler 
					implements Runnable{
		/*
		 * ���߳�������ָ���ͻ��˽�����Socket
		 */
		private Socket socket;
		//�ͻ��˵ĵ�ַ��Ϣ
		private String host;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			/*
			 * ͨ��Socket��ȡԶ�̼������ַ��Ϣ
			 * ���ڷ���˶��ԣ�Զ�̼�������ǿͻ�
			 * ����
			 */
			InetAddress address
				= socket.getInetAddress();
			host = address.getHostAddress();
		}
		
		public void run(){
			PrintWriter pw = null;
			try {
				/*
				 * ͨ��Socket��ȡ��������Ա��ڽ���Ϣ
				 * ���͸��ͻ���
				 */
				OutputStream out 
					= socket.getOutputStream();
				OutputStreamWriter osw
					= new OutputStreamWriter(
						out,"UTF-8");
				pw = new PrintWriter(osw,true);
				
				/*
				 * ����ǰ�ͻ��˵���������빲����
				 */
				addOut(pw);
				
				
				sendMessage(host+"�����ˣ�");
				/*
				 * ��ȡԶ�˼�������͹���������
				 * Socket�����˷���:
				 * InputStream getInputStream()
				 * 
				 * ͨ���������Զ�ȡԶ�˼�������͹���������
				 * �ֽڡ�
				 * 
				 */
				InputStream in 
					= socket.getInputStream();
				
				InputStreamReader isr
					= new InputStreamReader(
						in,"UTF-8"	
					);
				
				BufferedReader br
					= new BufferedReader(isr);
				
				String message = null;
				/*
				 * br.readLine()�ڶ�ȡ�ͻ��˷��͹�����һ�仰
				 * ������ڿͻ��˵Ĳ���ϵͳ��ͬ����ô���ͻ���
				 * �Ͽ�����ʱ������˵���������ķ�ӦҲ����ͬ:
				 * 
				 * ��windows�Ŀͻ��˶Ͽ�����ʱ��readLine����
				 * ��ֱ���׳��쳣��
				 * 
				 * ��linux�Ŀͻ��˶Ͽ�����ʱ��readLine������
				 * ����NULL
				 */
				while((message = br.readLine())!=null){
//					System.out.println(host+"˵:"+message);
//					pw.println(host+"˵:"+message);
					sendMessage(host+"˵:"+message);
				}
			} catch (Exception e) {
				
			} finally{
				//���ͻ��˶Ͽ����Ӻ�Ĺ���
				
				//���ÿͻ��˵�������ӹ�������ɾ��
				removeOut(pw);
				
				
				sendMessage(host+"�����ˣ�");
				
				/*
				 * �ر���ͻ���ͨѶ��Socket���ͷ�
				 * ��Դ
				 */
				if(socket != null){
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







