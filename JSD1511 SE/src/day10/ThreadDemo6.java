package day10;
/**
 * �߳����ȼ�
 * �����̵߳��ȵĹ������ܸ��棬��������ֻ��ͨ��������
 * �̵����ȼ������̶ȵĸ����̱߳������ʱ��Ƭ����
 * �����ϣ����ȼ�Խ�ߵ��̣߳���ȡʱ��Ƭ�Ĵ���Խ��
 * ���ȼ���10���ȼ����ֱ��Ӧ1-10����
 * @author Administrator
 *
 */
public class ThreadDemo6 {
	public static void main(String[] args) {
		Thread max=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("max");
				}
			}
		};
		Thread min=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("min");
				}
			}
		};
		Thread norm=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("norm");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		
		max.start();
		min.start();
		norm.start();
	}
}
