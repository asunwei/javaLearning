package oo.day06;

public class NstClassDemo {
	public static void main(String[] args) {
	//Inter2 o1=new Inter2();//�ӿڲ��ܱ�ʵ����	
		//1.������һ��Iner2��һ�����࣬û������
		//2.Ϊ���ഩ��һ��������Ϊo1
		//3.�������е�Ϊ���������
		Inter2 o2=new Inter2(){
			
		};
		
		Inter3 o3=new Inter3(){
			public void run(){
				System.out.println("abc");
				
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