package oo.day04;
//��д�����ص�����
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		//��д:�����������   ����:�����õ�����
		Eoo eoo = new Eoo();
		Coo o = new Doo(); //��������
		eoo.test(o);
	}
}

class Coo{
	void show(){
		System.out.println("����--show");
	}
}
class Doo extends Coo{
	void show(){
		System.out.println("����--show");
	}
}
class Eoo{
	void test(Coo o){
		System.out.println("�����Ͳ���");
		o.show();
	}
	void test(Doo o){
		System.out.println("�����Ͳ���");
		o.show();
	}
}
















