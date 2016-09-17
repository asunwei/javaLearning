package day11;
/**
 * 静态方法锁
 * 
 * Class类
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
		System.out.println(t+"执行了dosome方法");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t+"执行完毕dosome方法");
	}
	
}
