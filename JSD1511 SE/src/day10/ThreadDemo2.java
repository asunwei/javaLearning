package day10;
/**
 * 第二种创建线程方式
 * 单独定义任务（实现Runnable接口）
 * 由于任务是实现接口，java中接口是多实现的，所以
 * 不会造成继承冲突
 * 由于单独定义任务，而不是在定义线程的同时在内部定义任务，
 * 所以任务和线程没有必然的耦合关系
 * 以上两个问题是第一种创建线程的弊端，在第二种创建线程方式中解决了
 * @author Administrator
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		Runnable runn1=new MyRunnable1();
		Runnable runn2=new MyRunnable2();
		Thread t1=new Thread(runn1);
		Thread t2=new Thread(runn2);
		t1.start();
		t2.start();
		
		}
}

class MyRunnable1 implements Runnable{
	public void run(){
		
		for(int i=0;i<1000;i++){
			System.out.println("你是谁 啊？");
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的！");
		}
	}
}