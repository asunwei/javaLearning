package oo.day04;
//static的演示
public class StaticDemo {
	public static void main(String[] args) {
		Joo o1 = new Joo();
		o1.test();
		Joo o2 = new Joo();
		o2.test();
		System.out.println(Joo.b); //常常通过类名.来访问
		System.out.println(o1.b); //也可以通过对象.来访问
		
		Koo.say();
		
		Loo o3 = new Loo();
		Loo o4 = new Loo();
		Loo o5 = new Loo();
		
	}
}


class Loo{
	static{
		System.out.println("静态块");
	}
	Loo(){
		System.out.println("构造方法");
	}
}



class Koo{
	int a;
	static int b;
	void show(){
		a = 1;
		b = 2;
	}
	static void say(){
		//静态方法没有隐式this传递，没有this意味着没有对象，
		//而实例变量a必须通过对象点来访问，所以此处编译错误
		//a = 1; //编译错误
		b = 2;
	}
}




class Joo{
	int a;
	static int b;
	Joo(){
		a++;
		b++;
	}
	void test(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}












