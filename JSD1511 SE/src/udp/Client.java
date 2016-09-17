package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 基于UDP通讯的客户端
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		try {
			/*
			 * 流程
			 * 1：创建UDP通讯的Socket
			 * 2：准备要发送的数据
			 * 3：打包
			 *    3.1：准备远端计算机地址信息
			 *    3.2：准备远端计算机端口信息
			 *    3.3：将数据与地址信息进行打包
			 * 4：通过Socket将包发出去
			 * 再次发送重复执行2，3，4即可
			 */
			//1.
			DatagramSocket socket=new DatagramSocket();
			
			//2
			String message="你好服务端!";
			//将指定自字符串按照字符集转换为一组字节
			byte[] data=message.getBytes("UTF-8");
			
			//3
			//3.1
			InetAddress address =InetAddress.getByName("localhost");
			
			//3.2
			/*
			 * TCP协议的端口和UDP的端口之间不
			 * 冲突
			 */
			int port=8088;
			
			//3.3
			DatagramPacket packet=new DatagramPacket(data,data.length,address,port);
			
			//4
			socket.send(packet);
			
			/*
			 * 接收服务端发送过来的数据
			 */
			//2
		    data=new byte[100];
		    packet=new DatagramPacket(data,data.length);
			
			//3
			/*
			 * reiceive()是一个阻塞方法，直到远程计算机发送过来
			 * 数据为止
			 */
			socket.receive(packet);
			
			//4
//			data=packet.getData();
			message=new String(data,0,packet.getLength(),"UTF-8");
			System.out.println("服务端说："+message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
