package oo.day04;

public class Foo {
	public int a;    //所有
	protected int b; //本，子，同包
	int c;           //本，同包
	private int d;   //本
	
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







