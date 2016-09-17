package day11;
/**
 * wait��notify����
 * ��������������Object�ж����
 * ����Э���߳�ͬ������join�������
 * 
 * ��һ���̵߳�����һ������������󣩵�wait����ʱ
 * ���߳̽���������״̬��ֱ���ö����notify����������
 * ����̲߳Ż������������������д���
 * @author Administrator
 *
 */
public class ThreadDemo1 {
	public static Object obj=new Object();
	public static boolean isFinish;
	public static void main(String[] args) {
		final Thread download=new Thread(){			
			public void run(){
				System.out.println("down����ʼ����ͼƬ...");
				for(int i=0;i<=100;i++){
					System.out.println("down:ͼƬ����"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("down:ͼƬ�������!");
				isFinish=true;
				/*
				 * ��ͼƬ������ϣ��Ϳ���show�߳̿�ʼ
				 * ��ʾͼƬ
				 */
				synchronized(obj){
					obj.notify();
				}
				//�������ظ���
				System.out.println("down:��ʼ���ظ���...");
				for(int i=0;i<=100;i++){
					System.out.println("down:��������"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
				System.out.println("down:����������ɣ�");
			}
		};
		
		Thread show=new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ͼƬ...");
				try {
					//download.join();
					synchronized(obj){
						obj.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("show:ͼƬû���������");
				}
				System.out.println("show:ͼƬ�����");
			}
		};
		download.start();
		show.start();
	}
}
