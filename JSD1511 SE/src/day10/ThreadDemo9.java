package day10;
/**
 * join������ʹ���и÷������߳̽�������״̬
 * ֱ����ȴ����̹߳�����ϣ��Ż���
 * ͨ������Э���̼߳�ͬ������ʹ��
 * @author Administrator
 *
 */
public class ThreadDemo9 {
	//������ʶͼƬ�Ƿ�������ϵ�һ��״̬
	public static boolean isFinish;
	public static void main(String[] args) {
		final Thread download =new Thread(){
			public void run(){
				System.out.println("down:��ʼ����");
				for(int i=0;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("down��ͼƬ������ϣ�");
				isFinish=true;
			}
		};
		Thread show=new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ");
				/*
				 * ������ȴ�download��ͼƬ�������
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("ͼƬû���������");
				}
				System.out.println("show:��ʾͼƬ��ϣ�");
			}
		};
		download.start();
		show.start();
		
	}
}
