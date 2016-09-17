package day11;
/**
 * 有效的缩小同步范围可以在保证并发安全的前提下
 * 提高并发效率
 * @author Administrator
 *
 */
public class SynDemo2 {
	public static void main(String[] args) {
		//若new的不是同一个对象的话，保证不了线程同步
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
			System.out.println(t+"正在挑衣服...");
			Thread.sleep(5000);
			/*
			 * 使用同步块可以减小同步范围，提高并发效率
			 * 但是要保证，多个线程看到同步监视器对象是
			 * 相同的！否则没有同步效果，通常使用this即可
			 */
			synchronized(this){
				System.out.println(t+"正在试衣服...");
			    Thread.sleep(5000);
			}
			System.out.println(t+"结账离开");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}