package day11;
/**
 * �����߳��л�ʱ���Ĳ�ȷ���ԣ����¶���߳���ͬʱ����һ�����ݣ���
 * ���������������������ʱ���ܵ���ϵͳ�߼����ִ�������ϵͳ̱��
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
	//��������20������
	private int beans=20;
	/*
	 * ��һ��������synchronized�����κ󣬸÷�����Ϊͬ����������˼����
	 * �κ�����²�������������ϵ��߳��ڸ÷����ڲ�ִ�е�
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("û�ж����ˣ�");
		}
		Thread.yield();
		return beans--;
	}
	
}