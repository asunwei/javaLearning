package day10;
/**
 * ʹ�������ڲ��ഴ���߳�
 * @author Administrator
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		//��ʽ1
		Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭����");
				}
			}
		};
		//��ʽ2
		Runnable runn=new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("���ǲ�ˮ��ģ�");
				}
			}
		};
		Thread t2=new Thread(runn);
		t1.start();
		t2.start();
	}
}
