package day11;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *编写计时线程
 * @author Administrator
 *
 */
public class homework_xiancheng {
	public static void main(String[] args) {
		Thread t=new Thread(){
			public void run(){
				while(true){
					SimpleDateFormat sdf=new SimpleDateFormat("HH:MM:ss");
					System.out.println(sdf.format(new Date()));
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		t.setDaemon(true);
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main方法线程结束");
	}
}
