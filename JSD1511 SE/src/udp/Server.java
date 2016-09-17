package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDPЭ���Server��
 * @author Administrator
 *
 */
public class Server {
	public static void main(String[] args) {
		try {
			/*
			 * �����������̣�
			 * 1������Socket
			 * 2��׼��һ�����������õİ����ð��洢���ݵ�����Ӧ���㹻��
			 * 3��ͨ��Socket����Զ�˼�������͹�����
			 *    ���ݣ������д�����հ��У������պ�
			 *    ���г����н��յõ��������⣬������ͨ����
			 *    ��֪Զ�˼�����ĵ�ַ��Ϣ���Լ�ʵ�ʽ������ݵĴ�С
			 * 4��ͨ���������յ�����ȡ������ʹ��
			 */
			
			//1
			DatagramSocket socket =new DatagramSocket(8088);
			
			//2
			byte[] data=new byte[100];
			DatagramPacket packet=new DatagramPacket(data,data.length);
			
			//3
			/*
			 * reiceive()��һ������������ֱ��Զ�̼�������͹���
			 * ����Ϊֹ
			 */
			socket.receive(packet);
			
			//4
//			data=packet.getData();
			String message=new String(data,0,packet.getLength(),"UTF-8");
			System.out.println("�ͻ���˵��"+message);
			
			/*
			 * �ظ��ͻ���
			 */
			//2
			 message="��ÿͻ���!";
			//��ָ�����ַ��������ַ���ת��Ϊһ���ֽ�
			 data=message.getBytes("UTF-8");
			
			//3
			//3.1ͨ�����հ���֪Զ�̼������ַ
			InetAddress address =packet.getAddress();
			
			//3.2ͨ�����հ���֪Զ�̼�����˿�
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
