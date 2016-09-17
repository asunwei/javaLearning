package day11;
/**
 * 由于线程切换时机的不确定性，导致多个线程若同时操作一个数据，会
 * 产生”抢“的情况，严重时可能导致系统逻辑出现错误，甚至系统瘫痪
 * @author Administrator
 *
 */
public class SynDemo1 {
	public static void main(String[] args) {
		final Table table=new Table();
		 Thread t1=new Thread(){
			public void run(){
				while(true){
					int bean=table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				while(true){
					int bean=table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
 
class Table{
	//桌子上有20个豆子
	private int beans=20;
	/*
	 * 当一个方法被synchronized被修饰后，该方法变为同步方法。意思是在
	 * 任何情况下不会出现两个以上的线程在该方法内部执行的
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了！");
		}
		Thread.yield();
		return beans--;
	}
	
}