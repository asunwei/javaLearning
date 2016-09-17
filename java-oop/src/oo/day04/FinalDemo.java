package oo.day04;
//final的演示
public class FinalDemo {
	public static void main(String[] args) {
	}
}


final class Poo{}
//class Qoo extends Poo{} //编译错误，final的类不能被继承
class Roo{}
final class Soo extends Roo{}



class Noo{
	void show(){}
	final void say(){}
}
class Ooo extends Noo{
	void show(){}
	//void say(){} //编译错误，final的方法不能被重写
}



/*
 * final修饰成员变量:
 * 1)声明同时初始化或者在构造方法中初始化
 * final修饰局部变量:
 * 1)用之前初始化即可(不用可以不初始化)
 */
class Moo{
	final int a = 5;
	final int b;
	Moo(){
		b = 5;
	}

	void show(){
		final int c;
		//System.out.println(c); //编译错误，使用之前必须初始化
		//a = 55; //编译错误，final的变量不能被改变
	}
}







