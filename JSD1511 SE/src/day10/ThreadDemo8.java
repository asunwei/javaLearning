package day10;
/**
 * �ػ��̣߳�Ҳ��Ϊ��̨�߳�
 * ��һ�������е�����ǰ̨�̶߳�����ʱ�����̽���
 * ���ԣ����۽������ػ��Ƿ������ж�Ҫǿ�Ʊ��ж�
 * @author Administrator
 *
 */
public class ThreadDemo8 {
	public static void main(String[] args) {
		/*
		 * rose������ǰ̨����
		 */
		Thread rose=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose��������AAAAaaaa...");
				System.out.println("rose����ͨ...");
			}
		};
		
		
		/*
		 * jack:���ݺ�̨����
		 */
		Thread jack=new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump! i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		//���ú�̨�߳�Ҫ��start�����е���ǰ̨,Ϊ�ػ��߳�
		jack.setDaemon(true);
		rose.start();
		jack.start();
		//��ѭ����mainǰ̨�̲߳������
		//while(true);
		
	}
}
