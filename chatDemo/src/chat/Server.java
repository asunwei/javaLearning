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
 * 聊天室服务端
 * @author Administrator
 *
 */
public class Server {
	/*
	 * 运行在服务端的Socket
	 * 主要作用:
	 * 1:申请服务端端口，客户端就是根据该端口
	 *   连接上服务端的
	 * 2:监听端口，一旦客户端通过该端口连接后，
	 *   就创建一个Socket与该客户端进行交互。  
	 */
	private ServerSocket server;
	/*
	 * 保存所有客户端输出流的集合，用于广播消息使用
	 */
	private List<PrintWriter> allOut;
	
	public Server() throws Exception{
		try {
			server = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
		} catch (Exception e) {
			System.out.println("服务端初始化失败!");
			throw e;
		}
	}
	/**
	 * 将给定的输出流存入共享集合中
	 * @param pw
	 */
	private synchronized void addOut(PrintWriter pw){
		allOut.add(pw);
	}
	/**
	 * 将给定的输出流从共享集合中删除
	 * @param pw
	 */
	private synchronized void removeOut(PrintWriter pw){
		allOut.remove(pw);
	}
	/**
	 * 遍历共享集合中的每一个输出流，将给定消息
	 * 发送出去，进行广播功能
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
			 * 监听8088端口，等待客户端连接
			 * Socket accept()
			 * 该方法是一个阻塞方法，直到一个客户端
			 * 通过该端口连接为止，否则会一直阻塞。
			 * 当连接后，会自动获取一个Socket，通过
			 * 这个Socket就可以与刚连接上的客户端进
			 * 行通讯了。
			 * 若希望再次接收其他客户端的连接，需要
			 * 再次调用该方法。
			 */
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了!");
				/*
				 * 当一个客户端连接后，启动一个线程ClientHandler
				 * 来负责与该客户端的交互工作。
				 */
				ClientHandler handler
					= new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
				
			}
			
		} catch (Exception e) {
			System.out.println("服务端运行异常!");
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
	 * 该线程用来完成与指定客户端交互的工作
	 * @author Administrator
	 *
	 */
	private class ClientHandler 
					implements Runnable{
		/*
		 * 该线程用于与指定客户端交互的Socket
		 */
		private Socket socket;
		//客户端的地址信息
		private String host;
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			/*
			 * 通过Socket获取远程计算机地址信息
			 * 对于服务端而言，远程计算机就是客户
			 * 端了
			 */
			InetAddress address
				= socket.getInetAddress();
			host = address.getHostAddress();
		}
		
		public void run(){
			PrintWriter pw = null;
			try {
				/*
				 * 通过Socket获取输出流，以便于将消息
				 * 发送给客户端
				 */
				OutputStream out 
					= socket.getOutputStream();
				OutputStreamWriter osw
					= new OutputStreamWriter(
						out,"UTF-8");
				pw = new PrintWriter(osw,true);
				
				/*
				 * 将当前客户端的输出流存入共享集合
				 */
				addOut(pw);
				
				
				sendMessage(host+"上线了！");
				/*
				 * 读取远端计算机发送过来的数据
				 * Socket定义了方法:
				 * InputStream getInputStream()
				 * 
				 * 通过该流可以读取远端计算机发送过来的所有
				 * 字节。
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
				 * br.readLine()在读取客户端发送过来的一句话
				 * 这里，由于客户端的操作系统不同，那么当客户端
				 * 断开连接时，服务端的这个方法的反应也不相同:
				 * 
				 * 当windows的客户端断开连接时，readLine方法
				 * 会直接抛出异常。
				 * 
				 * 当linux的客户端断开连接时，readLine方法会
				 * 返回NULL
				 */
				while((message = br.readLine())!=null){
//					System.out.println(host+"说:"+message);
//					pw.println(host+"说:"+message);
					sendMessage(host+"说:"+message);
				}
			} catch (Exception e) {
				
			} finally{
				//当客户端断开连接后的工作
				
				//将该客户端的输出流从共享集合中删除
				removeOut(pw);
				
				
				sendMessage(host+"下线了！");
				
				/*
				 * 关闭与客户端通讯的Socket以释放
				 * 资源
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







