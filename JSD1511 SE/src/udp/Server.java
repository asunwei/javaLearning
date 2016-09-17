package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议的Server端
 * @author Administrator
 *
 */
public class Server {
	public static void main(String[] args) {
		try {
			/*
			 * 接收数据流程：
			 * 1：创建Socket
			 * 2：准备一个接收数据用的包，该包存储数据的容量应当足够大
			 * 3：通过Socket接收远端计算机发送过来的
			 *    数据，并进行存入接收包中，当接收后，
			 *    包中除了有接收得到的数据外，还可以通过包
			 *    得知远端计算机的地址信息，以及实际接收数据的大小
			 * 4：通过包将接收的数据取出来并使用
			 */
			
			//1
			DatagramSocket socket =new DatagramSocket(8088);
			
			//2
			byte[] data=new byte[100];
			DatagramPacket packet=new DatagramPacket(data,data.length);
			
			//3
			/*
			 * reiceive()是一个阻塞方法，直到远程计算机发送过来
			 * 数据为止
			 */
			socket.receive(packet);
			
			//4
//			data=packet.getData();
			String message=new String(data,0,packet.getLength(),"UTF-8");
			System.out.println("客户端说："+message);
			
			/*
			 * 回复客户端
			 */
			//2
			 message="你好客户端!";
			//将指定自字符串按照字符集转换为一组字节
			 data=message.getBytes("UTF-8");
			
			//3
			//3.1通过接收包得知远程计算机地址
			InetAddress address =packet.getAddress();
			
			//3.2通过接收包得知远程计算机端口
			int port=packet.getPort();
			
			//3.3
			 packet=new DatagramPacket(data,data.length,address,port);
			
			//4
			socket.send(packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
