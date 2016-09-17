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
	 * ��Ҫ���ã�
	 * 1���������˶˿ڣ��ͻ��˾��Ǹ��ݸö˿������Ϸ���˵�
	 * 2:�����˿ڣ�һ���ͻ���ͨ���ö˿����Ӻ�
	 *   �ʹ���һ��Socket��ͻ��˽��н���
	 */
	
	private ServerSocket server;
	/*
	 * �������Կͻ���������ļ��ϣ����ڹ㲥��Ϣʹ��
	 */
	private List<PrintWriter> allOut;
    public Server() throws Exception{
		try {
			//����˿ں�
			server=new ServerSocket(8088);
			allOut=new ArrayList<PrintWriter>();
		} catch (Exception e) {
			System.out.println("����˳�ʼ��ʧ�ܣ�");
			throw e;
		}	
	}
    /*
	 * ����������������빲����
	 */
	private synchronized void addOut(PrintWriter pw){
		allOut.add(pw);
	}
	/*
	 *��������������ӹ�������ɾ�� 
	 */
	private synchronized void removeOut(PrintWriter pw){
		allOut.remove(pw);
	}
	/*
	 * �����������е�ÿһ�������������������Ϣ���ͳ�ȥ������
	 * �㲥����
	 */
	private synchronized void sendMessage(String message){
		for(PrintWriter pw:allOut){
			pw.println("��ǰ����������"+allOut.size());
			pw.println(message);
		}
	}
	public void start() throws Exception{
		try {
			/*����8088�˿ڣ��ȴ��ͻ�������
			 * Socket accept()
			 * �÷�����һ������������ֱ��һ���ͻ���ͨ���ö˿�
			 * ����Ϊֹ�������һֱ�����������Ӻ󣬻��Զ���ȡ
			 * һ��Socket��ͨ�����Socket�Ϳ�����������ϵĿͻ���
			 * ����ͨѶ
			 * ��ϣ���ٴν��������ͻ������ӣ���Ҫ�ٴε��ø÷���
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������...");
			    Socket socket=server.accept();
			    System.out.println("һ���ͻ��������ˣ�");
			    /*
			     * ��һ���ͻ������Ӻ�����һ���߳�ClientHandler
			     * ��������ͻ��˽�������
			     */
			    ClientHandler handler=new ClientHandler(socket);
			    Thread t=new Thread(handler);
			    t.start();
			}
					
		} catch (Exception e) {
			System.out.println("����������쳣��");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			Server server=new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private class ClientHandler implements Runnable{
		/*
		 * ���߳�������ָ���ͻ��˽�����Socket
		 * ���췽��
		 */
		private Socket socket;
		private String host;
		public ClientHandler(Socket socket){
			this.socket=socket;
			/*
			 * ͨ��Socket��ȡԶ�̼������ַ��Ϣ
			 * ���ڷ���˶��ԣ�Զ�̼�������ǿͻ���
			 */
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
		}
		public void run(){
			PrintWriter pw=null;
			try {
				/*
				 * ͨ��Socket��ȡ��������Ա㽫��Ϣ���͸��ͻ���
				 */
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			    pw=new PrintWriter(osw,true);
				
				/*
				 * ����ǰ�ͻ�����������뵽������
				 */
				addOut(pw);
				sendMessage(host+"�����ˣ�");
				/*
				 * ����һ���̣߳��ø��߳�
				 * ��ȡԶ�˼�������͹���������
				 * Socket���巽��
				 * InputStream getInputStream()
				 * 
				 * ͨ���������Զ�ȡԶ�˼�������͹����������ֽ�
				 */
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
				BufferedReader br=new BufferedReader(isr);
				String message=null;
				/*
				 * br.readLine()�ڶ�ȡ�ͻ��˷��͹�����һ�仰
				 * ������ڿͻ��˵Ĳ���ϵͳ��ͬ����ô�ͻ���
				 * �Ͽ�����ʱ������˵���������ķ���ӦҲ��ͬ
				 * 
				 * ��windowns�Ŀͻ��˶Ͽ�����ʱ��readLine�������Զ��׳��쳣
				 * 
				 * ��Linux�Ŀͻ��˶Ͽ�����ʱ��readLine��������Null
				 */
				while((message=br.readLine())!=null){
//					System.out.println(host+"˵��"+message);
//					pw.println(host+"˵��"+message);
					sendMessage(host+"˵��"+message);
				}
			} catch (Exception e) {
				
			}finally{
				//���ͻ��˶Ͽ����Ӻ�Ĺ���
				
				//���ÿͻ��˵�������ӹ�������ɾ��
				removeOut(pw);
				
				sendMessage(host+"�����ˣ�");
				/*				 * 
				 * close()  �رտͻ���ͨѶ��socket���ͷ���Դ
				 */
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






