package oo.day05;
//static final��������ʾ
public class StaticFinalDemo {
	public static void main(String[] args) {
		System.out.println(Aoo.PI); //ͨ��������������
		//Aoo.PI = 3.1415926; //������󣬳������ܱ��ı�
		
		//1.�������м���Boo.class
		//2.num2�洢�ڷ�������
		//3.���������л�ȡnum2��ֵ�����
		System.out.println(Boo.num2);
		
		//�ڱ����ڱ�ֱ���滻Ϊ�����ֵ��Ч�ʸ�
		//�൱��System.out.println(100);
		System.out.println(Boo.NUM);
	}
}

class Boo{
	public static final int NUM = 100; //����
	public static int num2 = 200; //��̬����
}








class Aoo{
	public static final double PI=3.14159;
	//public static final int NUM; //������󣬱�������ͬʱ��ʼ��
}













