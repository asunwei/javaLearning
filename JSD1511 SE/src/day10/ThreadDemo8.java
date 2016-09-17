package day10;
/**
 * 守护线程，也称为后台线程
 * 当一个进程中的所有前台线程都结束时，进程结束
 * 所以，无论进程中守护是否还在运行都要强制被中断
 * @author Administrator
 *
 */
public class ThreadDemo8 {
	public static void main(String[] args) {
		/*
		 * rose：扮演前台进程
		 */
		Thread rose=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose：啊啊啊AAAAaaaa...");
				System.out.println("rose：噗通...");
			}
		};
		
		
		/*
		 * jack:扮演后台进程
		 */
		Thread jack=new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump! i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		//设置后台线程要在start方法中调用前台,为守护线程
		jack.setDaemon(true);
		rose.start();
		jack.start();
		//死循环，main前台线程不会结束
		//while(true);
		
	}
}
