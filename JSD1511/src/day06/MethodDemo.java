package day06;
//��������ʾ
public class MethodDemo {
	public static void main(String[] args) {
		//say();
		
		/*
		//sayHi(); //��������в�����봫��
		//sayHi(25); //������󣬲������Ͳ�ƥ��
		sayHi("zhangsan"); //String name="zhangsan"
		sayHi("lisi"); //String name="lisi"
		sayHi("wangwu"); //String name="wangwu"
		*/
		
		//int a = getNum(); //getNum()��ֵ����return����Ǹ�ֵ
		//System.out.println(a);
		
		//double num = plus(5.5,6.6); //double a=5.5,double b=6.6
		//System.out.println(num);
		
		//a(); //������Ƕ�׵���
		
		/*
		double num1=5.1;
		double num2=5.2;
		double ccccc=plus(num1,num2); //double a=5.1,double b=5.2
		System.out.println(ccccc);
		*/
		
		System.out.println("over");
	}
	
	public static void a(){
		System.out.println(111);
		b(); //������Ƕ�׵���
		System.out.println(222);
	}
	public static void b(){
		System.out.println(333);
	}
	
	
	//�в��з���ֵ
	public static double plus(double a,double b){
		double c = a + b;
		return c; //���ص���c�����Ǹ���
		
		//return a+b;
	}
	
	//�޲��з���ֵ
	public static int getNum(){
		//return; //������󣬱��뷵��һ�����
		//return 5.678; //������󣬷���ֵ���Ͳ�ƥ��
		return 250; //1.����������ִ��  2.����250�����÷�
	}
	
	//�в��޷���ֵ
	public static void sayHi(String name){
		System.out.println("��Һã��ҽ�"+name);
	}
	
	//�޲��޷���ֵ
	public static void say(){
		System.out.println("��Һã��ҽ�WKJ");
		return; //1.����������ִ��
	}
	
	
}












