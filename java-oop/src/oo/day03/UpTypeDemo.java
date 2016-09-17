package oo.day03;
//向上造型的演示
public class UpTypeDemo {
	public static void main(String[] args) {
		Coo o1 = new Coo(); //父只能调父的
		o1.c = 1;
		o1.show();
		
		Doo o2 = new Doo(); //子既能调子的也能调父的
		o2.d = 1;
		o2.say();
		o2.c = 2;
		o2.show();
		
		Coo o3 = new Doo(); //向上造型
		o3.c = 1;
		o3.show();
		//o3.d = 2; //编译错误，能点出来什么，看引用的类型
	}
}

class Coo{
	int c;
	void show(){}
}
class Doo extends Coo{
	int d;
	void say(){}
}


















