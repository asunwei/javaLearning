package day10;
/**
 * �߳��ṩ��һ����̬����sleep(long ms)
 * �÷�������ʹ���и÷������߳�����ָ�����롣
 * ��������ʱ�󣬸��̻߳�ص�Runnable״̬���ȴ��ٴ�
 * ����ʱ��Ƭ���������
 * @author Administrator
 *
 */
public class ThreadDemo7 {
	public static void main(String[] args) {
		while(true){
			System.out.println("��ã�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
