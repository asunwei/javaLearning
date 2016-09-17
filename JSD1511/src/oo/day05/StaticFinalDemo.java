package oo.day05;
//static final常量的演示
public class StaticFinalDemo {
	public static void main(String[] args) {
		System.out.println(Aoo.PI); //通过类名点来访问
		//Aoo.PI = 3.1415926; //编译错误，常量不能被改变
		
		//1.方法区中加载Boo.class
		//2.num2存储在方法区中
		//3.到方法区中获取num2的值并输出
		System.out.println(Boo.num2);
		
		//在编译期被直接替换为具体的值，效率高
		//相当于System.out.println(100);
		System.out.println(Boo.NUM);
	}
}

class Boo{
	public static final int NUM = 100; //常量
	public static int num2 = 200; //静态变量
}








class Aoo{
	public static final double PI=3.14159;
	//public static final int NUM; //编译错误，必须声明同时初始化
}













