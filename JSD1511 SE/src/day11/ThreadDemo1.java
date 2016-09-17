package day11;
/**
 * wait和notify方法
 * 这两个方法是在Object中定义的
 * 用于协调线程同步，比join方便灵活
 * 
 * 当一个线程调用了一个对象（任意对象）的wait方法时
 * 该线程进入阻塞的状态，直到该对象的notify方法被调用
 * 这个线程才会解除阻塞继续向下运行代码
 * @author Administrator
 *
 */
public class ThreadDemo1 {
	public static Object obj=new Object();
	public static boolean isFinish;
	public static void main(String[] args) {
		final Thread download=new Thread(){			
			public void run(){
				System.out.println("down：开始下载图片...");
				for(int i=0;i<=100;i++){
					System.out.println("down:图片下载"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("down:图片下载完成!");
				isFinish=true;
				/*
				 * 当图片下载完毕，就可以show线程开始
				 * 显示图片
				 */
				synchronized(obj){
					obj.notify();
				}
				//继续下载附件
				System.out.println("down:开始下载附件...");
				for(int i=0;i<=100;i++){
					System.out.println("down:附件下载"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
				System.out.println("down:附件下载完成！");
			}
		};
		
		Thread show=new Thread(){
			public void run(){
				System.out.println("show:开始打开图片...");
				try {
					//download.join();
					synchronized(obj){
						obj.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("show:图片没有下载完成");
				}
				System.out.println("show:图片打开完成");
			}
		};
		download.start();
		show.start();
	}
}
