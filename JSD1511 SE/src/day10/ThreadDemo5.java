package day10;
/**
 * 获取线程相关信息的API
 * @author Administrator
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		//获取ID
		long id=t.getId();
		System.out.println("id:"+id);
		//获取name
		String name =t.getName();
		System.out.println("name:"+name);
		//获取优先级
		int priority=t.getPriority();
		System.out.println("priority:"+priority);
		//获取活动状态
		boolean isAlive=t.isAlive();
		System.out.println("isAlive:"+isAlive);
		//获取是否守护线程
		boolean isDaemon=t.isDaemon();
		System.out.println("isDaemon:"+isDaemon);
		//获取是否已经中断
		boolean isInterrupted=t.isInterrupted();
		System.out.println("isInterrrupted:"+isInterrupted);
		
	}
}
