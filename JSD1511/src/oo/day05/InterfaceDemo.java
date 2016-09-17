package oo.day05;
//接口的演示
public class InterfaceDemo {
	public static void main(String[] args) {
		//Inter5 o1 = new Inter5(); //编译错误，接口不能被实例化
		Foo    o2 = new Foo();
		Inter6 o3 = new Foo(); //向上造型
		Inter5 o4 = new Foo(); //向上造型
		
		/*
		 * 接口的练习:
		 * 1.声明接口Inter1，包含常量PI和抽象方法show
		 * 2.声明接口Inter2，包含a()和b()
		 *   声明类Aoo，实现Inter2
		 * 3.声明接口Inter3，包含c()
		 *   声明类Boo，实现Inter2和Inter3
		 * 4.声明抽象类Coo，包含抽象方法d()
		 *   声明类Doo，继承Coo并实现Inter2和Inter3
		 * 5.声明接口Inter4，继承Inter3
		 *   声明类Eoo，实现Inter4
		 * 6.main()方法中:
		 *    Inter4 o1 = new Inter4();--???
		 *    Inter4 o2 = new Eoo();-----???
		 *    Inter3 o3 = new Eoo();-----???
		 *    
		 */
	}
}



//接口间的继承
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





//接口的多实现
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




//接口的实现
interface Inter2{
	void a();
	void b();
}
class Coo implements Inter2{
	public void a(){}
	public void b(){}
}





//演示接口的基础语法
interface Inter1{
	public static final double PI=3.14159;
	public abstract void show();
	
	int NUM=2; //默认public static final
	void say(); //默认public abstract
	
	//int num2; //编译错误，默认常量，必须声明同时初始化
	//void sayHi(){} //编译错误，默认抽象方法，不能有方法体
}















