package day11;
/**
 * synchronized������ʵ�ֻ�����
 * ��synchronized����ͬ�Ĵ��������ֻҪ
 * ��������ͬ����ô��Щ��ͬ�Ĵ����;��л�����
 * @author Administrator
 *
 */
public class SynDemo4 {
	public static void main(String[] args) {
		final Boo b=new Boo();
		Thread t1=new Thread(){
			public void run(){
				b.methodA();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				b.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class Boo{
	public synchronized void methodA(){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t+"����ִ��A������");
			Thread.sleep(5000);
			System.out.println(t+"ִ��A������ϣ�");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		public synchronized void methodB(){
			try {
				Thread t=Thread.currentThread();
				System.out.println(t+"����ִ��B������");
				Thread.sleep(5000);
				System.out.println(t+"ִ��B������ϣ�");
			} catch (Exception e) {
				// TODO: handle exception
			}
   }
}
