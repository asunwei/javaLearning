package oo.day06;
//�����ڲ�����ʾ
public class NstClassDemo {
	public static void main(String[] args) {
		//Inter2 o1 = new Inter2(); //������󣬽ӿڲ��ܱ�ʵ����
		
		//1.������Inter2��һ�����࣬û������
		//2.Ϊ�����ഴ����һ��������Ϊo1
		//3.�������е�Ϊ���������
		Inter2 o1 = new Inter2(){

		};
		
		//1.������Inter2��һ�����࣬û������
		//2.Ϊ�����ഴ����һ��������Ϊo2
		//3.�������е�Ϊ���������
		Inter2 o2 = new Inter2(){
			
		};
		
		
		final int num=250;
		Inter3 o3 = new Inter3(){
			public void run(){
				System.out.println("abc");
				System.out.println(num); //num������final��
			}
		};
		o3.run();
		
	}
}

interface Inter3{
	public void run();
}

interface Inter2{
	
}




