package oo.day05;
//�ӿڵ���ʾ
public class InterfaceDemo {
	public static void main(String[] args) {
		//Inter5 o1 = new Inter5(); //������󣬽ӿڲ��ܱ�ʵ����
		Foo    o2 = new Foo();
		Inter6 o3 = new Foo(); //��������
		Inter5 o4 = new Foo(); //��������
		
		/*
		 * �ӿڵ���ϰ:
		 * 1.�����ӿ�Inter1����������PI�ͳ��󷽷�show
		 * 2.�����ӿ�Inter2������a()��b()
		 *   ������Aoo��ʵ��Inter2
		 * 3.�����ӿ�Inter3������c()
		 *   ������Boo��ʵ��Inter2��Inter3
		 * 4.����������Coo���������󷽷�d()
		 *   ������Doo���̳�Coo��ʵ��Inter2��Inter3
		 * 5.�����ӿ�Inter4���̳�Inter3
		 *   ������Eoo��ʵ��Inter4
		 * 6.main()������:
		 *    Inter4 o1 = new Inter4();--???
		 *    Inter4 o2 = new Eoo();-----???
		 *    Inter3 o3 = new Eoo();-----???
		 *    
		 */
	}
}



//�ӿڼ�ļ̳�
interface Inter5{
	void a();
}
interface Inter6 extends Inter5{
	void b();
}
class Foo implements Inter6{
	public void b(){}
	public void a(){}
}





//�ӿڵĶ�ʵ��
interface Inter3{
	void a();
}
interface Inter4{
	void b();
}
abstract class Doo{
	abstract void c();
}
class Eoo extends Doo implements Inter3,Inter4{
	public void a(){}
	public void b(){}
	void c(){}
}




//�ӿڵ�ʵ��
interface Inter2{
	void a();
	void b();
}
class Coo implements Inter2{
	public void a(){}
	public void b(){}
}





//��ʾ�ӿڵĻ����﷨
interface Inter1{
	public static final double PI=3.14159;
	public abstract void show();
	
	int NUM=2; //Ĭ��public static final
	void say(); //Ĭ��public abstract
	
	//int num2; //�������Ĭ�ϳ�������������ͬʱ��ʼ��
	//void sayHi(){} //�������Ĭ�ϳ��󷽷��������з�����
}















