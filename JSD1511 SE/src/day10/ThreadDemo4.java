package day10;
/**
 * �߳��ṩ��һ����̬�ķ�����currentThread
 * ������ȡִ�з������߳�
 * ������ִ��java�����ʱ�򣬲���ϵͳ���Զ�����һ���߳�
 * ��ÿ������������һ���̣߳���ô��������java�Ľ���������
 * ���Զ�����һ���߳�������main����
 * java�����еĴ��붼�ǿ��߳����е�
 * @author Administrator
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		System.out.println("����main�������߳����ƣ�"+main);
		dosome();
		//�Զ����߳�
		Thread t=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
				System.out.println("�����߳������ǣ�"+t);
				dosome();
				}
		};
		t.start();
	}
	
	
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("����dosome�������߳����ƣ�"+t);
	}
	
}
