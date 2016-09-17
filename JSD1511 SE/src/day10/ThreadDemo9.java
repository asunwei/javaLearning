package day10;
/**
 * join方法会使运行该方法的线程进入阻塞状态
 * 直到其等待的线程工作完毕，才会解除
 * 通常用来协调线程间同步工作使用
 * @author Administrator
 *
 */
public class ThreadDemo9 {
	//用来标识图片是否下载完毕的一个状态
	public static boolean isFinish;
	public static void main(String[] args) {
		final Thread download =new Thread(){
			public void run(){
				System.out.println("down:开始下载");
				for(int i=0;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("down：图片下载完毕！");
				isFinish=true;
			}
		};
		Thread show=new Thread(){
			public void run(){
				System.out.println("show:开始显示图片");
				/*
				 * 在这里等待download将图片下载完毕
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("图片没有下载完成");
				}
				System.out.println("show:显示图片完毕！");
			}
		};
		download.start();
		show.start();
		
	}
}
