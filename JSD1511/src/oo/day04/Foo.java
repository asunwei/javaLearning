package oo.day04;

public class Foo {
	public int a;    //����
	protected int b; //�����ӣ�ͬ��
	int c;           //����ͬ��
	private int d;   //��
	
	void show(){
		a = 1;
		b = 2;
		c = 3;
		d = 4;
	}
}

class Goo{ //private
	void show(){
		Foo o = new Foo();
		o.a = 1;
		o.b = 2;
		o.c = 3;
		//o.d = 4;
	}
}







