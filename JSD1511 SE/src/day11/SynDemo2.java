package day11;
/**
 * ��Ч����Сͬ����Χ�����ڱ�֤������ȫ��ǰ����
 * ��߲���Ч��
 * @author Administrator
 *
 */
public class SynDemo2 {
	public static void main(String[] args) {
		//��new�Ĳ���ͬһ������Ļ�����֤�����߳�ͬ��
		final Shop shop  =new Shop();
		final Shop shop1 =new Shop();
		Thread t1=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				shop1.buy();
			}
		};
		t1.start();
		t2.start();
		
	}
}
class Shop{
	public  void buy(){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t+"�������·�...");
			Thread.sleep(5000);
			/*
			 * ʹ��ͬ������Լ�Сͬ����Χ����߲���Ч��
			 * ����Ҫ��֤������߳̿���ͬ��������������
			 * ��ͬ�ģ�����û��ͬ��Ч����ͨ��ʹ��this����
			 */
			synchronized(this){
				System.out.println(t+"�������·�...");
			    Thread.sleep(5000);
			}
			System.out.println(t+"�����뿪");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}