package day11;
/**
 * synchronized还可以实现互斥性
 * 当synchronized将不同的代码加锁后，只要
 * 锁对象相同，那么这些不同的代码间就具有互斥性
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
			System.out.println(t+"正在执行A方法！");
			Thread.sleep(5000);
			System.out.println(t+"执行A方法完毕！");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		public synchronized void methodB(){
			try {
				Thread t=Thread.currentThread();
				System.out.println(t+"正在执行B方法！");
				Thread.sleep(5000);
				System.out.println(t+"执行B方法完毕！");
			} catch (Exception e) {
				// TODO: handle exception
			}
   }
}
