package day10;
/**
 * ��һ�ִ����̷߳�ʽ
 * �̳�Thread����дrun����
 * run�������߳�Ҫִ�е����������߳������
 * start���������ǲ���ֱ�ӵ���run�������÷�������
 * �߳����������󣬵�һ�η���ʱ��Ƭ��ʱ�Զ����õ�
 * @author Administrator
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		/*
		 * ���̵߳�start���������ú�run������
		 * �ܿ�ı����ã�������start���õĹ�����run������ִ��
		 * �̵߳��Ȼᾡ���ܾ��ȵĽ��̷߳�����������е��߳�
		 * ������֤һ��һ�ν�����䡣
		 * �������Ƕ��ԣ��̵߳��Ƚ�ʱ��Ƭ������ĸ��߳��ǲ��ɿصģ�
		 * ʱ��Ƭ����Ҳ���ɿء������̶߳��ԣ�ֻ�ܱ����ĵȴ�����ʱ��Ƭ
		 * ����������ȡ
		 */
		//����start������������run����
		t1.start();
		t2.start();
	}
}
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭����");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("���ǲ�ˮ��ģ�");
		}
	}
}
