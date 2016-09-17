package day10;
/**
 * 使用匿名内部类创建线程
 * @author Administrator
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		//方式1
		Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊？");
				}
			}
		};
		//方式2
		Runnable runn=new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是查水表的！");
				}
			}
		};
		Thread t2=new Thread(runn);
		t1.start();
		t2.start();
	}
}
