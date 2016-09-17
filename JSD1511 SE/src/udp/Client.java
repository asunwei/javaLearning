package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ����UDPͨѶ�Ŀͻ���
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		try {
			/*
			 * ����
			 * 1������UDPͨѶ��Socket
			 * 2��׼��Ҫ���͵�����
			 * 3�����
			 *    3.1��׼��Զ�˼������ַ��Ϣ
			 *    3.2��׼��Զ�˼�����˿���Ϣ
			 *    3.3�����������ַ��Ϣ���д��
			 * 4��ͨ��Socket��������ȥ
			 * �ٴη����ظ�ִ��2��3��4����
			 */
			//1.
			DatagramSocket socket=new DatagramSocket();
			
			//2
			String message="��÷����!";
			//��ָ�����ַ��������ַ���ת��Ϊһ���ֽ�
			byte[] data=message.getBytes("UTF-8");
			
			//3
			//3.1
			InetAddress address =InetAddress.getByName("localhost");
			
			//3.2
			/*
			 * TCPЭ��Ķ˿ں�UDP�Ķ˿�֮�䲻
			 * ��ͻ
			 */
			int port=8088;
			
			//3.3
			DatagramPacket packet=new DatagramPacket(data,data.length,address,port);
			
			//4
			socket.send(packet);
			
			/*
			 * ���շ���˷��͹���������
			 */
			//2
		    data=new byte[100];
		    packet=new DatagramPacket(data,data.length);
			
			//3
			/*
			 * reiceive()��һ������������ֱ��Զ�̼�������͹���
			 * ����Ϊֹ
			 */
			socket.receive(packet);
			
			//4
//			data=packet.getData();
			message=new String(data,0,packet.getLength(),"UTF-8");
			System.out.println("�����˵��"+message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
