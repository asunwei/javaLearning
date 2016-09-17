package day10;
/**
 * 线程提供了一个静态方法sleep(long ms)
 * 该方法用于使运行该方法的线程阻塞指定毫秒。
 * 当阻塞超时后，该线程会回到Runnable状态，等待再次
 * 分配时间片后继续运行
 * @author Administrator
 *
 */
public class ThreadDemo7 {
	public static void main(String[] args) {
		while(true){
			System.out.println("你好！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
