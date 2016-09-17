package oo.day04;
//重写与重载的区别
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		//重写:看对象的类型   重载:看引用的类型
		Eoo eoo = new Eoo();
		Coo o = new Doo(); //向上造型
		eoo.test(o);
	}
}

class Coo{
	void show(){
		System.out.println("父类--show");
	}
}
class Doo extends Coo{
	void show(){
		System.out.println("子类--show");
	}
}
class Eoo{
	void test(Coo o){
		System.out.println("父类型参数");
		o.show();
	}
	void test(Doo o){
		System.out.println("子类型参数");
		o.show();
	}
}

















