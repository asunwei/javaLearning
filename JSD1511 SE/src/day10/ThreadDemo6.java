package day10;
/**
 * 线程优先级
 * 由于线程调度的工作不能干涉，所以我们只能通过调整线
 * 程的优先级来最大程度的改善线程被分配的时间片机率
 * 理论上，优先级越高的线程，获取时间片的次数越多
 * 优先级有10个等级，分别对应1-10数字
 * @author Administrator
 *
 */
public class ThreadDemo6 {
	public static void main(String[] args) {
		Thread max=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("max");
				}
			}
		};
		Thread min=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("min");
				}
			}
		};
		Thread norm=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("norm");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		
		max.start();
		min.start();
		norm.start();
	}
}
