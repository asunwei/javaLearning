package day10;
/**
 * ��ȡ�߳������Ϣ��API
 * @author Administrator
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		//��ȡID
		long id=t.getId();
		System.out.println("id:"+id);
		//��ȡname
		String name =t.getName();
		System.out.println("name:"+name);
		//��ȡ���ȼ�
		int priority=t.getPriority();
		System.out.println("priority:"+priority);
		//��ȡ�״̬
		boolean isAlive=t.isAlive();
		System.out.println("isAlive:"+isAlive);
		//��ȡ�Ƿ��ػ��߳�
		boolean isDaemon=t.isDaemon();
		System.out.println("isDaemon:"+isDaemon);
		//��ȡ�Ƿ��Ѿ��ж�
		boolean isInterrupted=t.isInterrupted();
		System.out.println("isInterrrupted:"+isInterrupted);
		
	}
}
