package day10;
/**
 * 线程提供了一个静态的方法：currentThread
 * 用来获取执行方法的线程
 * 当我们执行java程序的时候，操作系统会自动启动一个线程
 * 而每个进程至少有一个线程，那么，当运行java的进程启动后。
 * 会自动创建一个线程来运行main方法
 * java中所有的代码都是靠线程运行的
 * @author Administrator
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		System.out.println("运行main方法的线程名称："+main);
		dosome();
		//自定义线程
		Thread t=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
				System.out.println("运行线程名称是："+t);
				dosome();
				}
		};
		t.start();
	}
	
	
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("调用dosome方法的线程名称："+t);
	}
	
}
