package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 主要解决两个问题
 * 1：控制线程数量
 * 2：重用线程
 * @author Administrator
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool =Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable runn=new Runnable(){
				public void run(){
					Thread t=Thread.currentThread();
					System.out.println(t+"正在运行的任务");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(t+"运行任务完毕！");
				}
			};
			threadPool.execute(runn);
		}
		//关闭线程池
		threadPool.shutdown();
		System.out.println("线程池已关闭！");
		
	}
}
