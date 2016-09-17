package day10;
/**
 * 第一种创建线程方式
 * 继承Thread并重写run方法
 * run方法是线程要执行的任务，启动线程则调用
 * start方法，我们不会直接调用run方法，该方法是在
 * 线程启动起来后，第一次分配时间片段时自动调用的
 * @author Administrator
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		/*
		 * 当线程的start方法被调用后，run方法会
		 * 很快的被调用，但不是start调用的过程中run方法被执行
		 * 线程调度会尽可能均匀的将线程分配给并发运行的线程
		 * 但不保证一人一次交替分配。
		 * 对于我们而言，线程调度将时间片分配给哪个线程是不可控的，
		 * 时间片长短也不可控。对于线程而言，只能被动的等待分配时间片
		 * 不能主动获取
		 */
		//调用start方法，而不是run方法
		t1.start();
		t2.start();
	}
}
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊？");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的！");
		}
	}
}
