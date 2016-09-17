package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * ��Ҫ�����������
 * 1�������߳�����
 * 2�������߳�
 * @author Administrator
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool =Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable runn=new Runnable(){
				public void run(){
					Thread t=Thread.currentThread();
					System.out.println(t+"�������е�����");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(t+"����������ϣ�");
				}
			};
			threadPool.execute(runn);
		}
		//�ر��̳߳�
		threadPool.shutdown();
		System.out.println("�̳߳��ѹرգ�");
		
	}
}
