package day11;
/**
 * ��̬������
 * 
 * Class��
 * @author Administrator
 *
 */
public class SynDemo3 {
	public static void main(String[] args) {
		Thread t1=new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}
 
class Foo{
	public synchronized static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println(t+"ִ����dosome����");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t+"ִ�����dosome����");
	}
	
}
