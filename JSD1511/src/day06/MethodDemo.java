package day06;
//方法的演示
public class MethodDemo {
	public static void main(String[] args) {
		//say();
		
		/*
		//sayHi(); //编译错误，有参则必须传参
		//sayHi(25); //编译错误，参数类型不匹配
		sayHi("zhangsan"); //String name="zhangsan"
		sayHi("lisi"); //String name="lisi"
		sayHi("wangwu"); //String name="wangwu"
		*/
		
		//int a = getNum(); //getNum()的值就是return后的那个值
		//System.out.println(a);
		
		//double num = plus(5.5,6.6); //double a=5.5,double b=6.6
		//System.out.println(num);
		
		//a(); //方法的嵌套调用
		
		/*
		double num1=5.1;
		double num2=5.2;
		double ccccc=plus(num1,num2); //double a=5.1,double b=5.2
		System.out.println(ccccc);
		*/
		
		System.out.println("over");
	}
	
	public static void a(){
		System.out.println(111);
		b(); //方法的嵌套调用
		System.out.println(222);
	}
	public static void b(){
		System.out.println(333);
	}
	
	
	//有参有返回值
	public static double plus(double a,double b){
		double c = a + b;
		return c; //返回的是c里面那个数
		
		//return a+b;
	}
	
	//无参有返回值
	public static int getNum(){
		//return; //编译错误，必须返回一个结果
		//return 5.678; //编译错误，返回值类型不匹配
		return 250; //1.结束方法的执行  2.返回250给调用方
	}
	
	//有参无返回值
	public static void sayHi(String name){
		System.out.println("大家好，我叫"+name);
	}
	
	//无参无返回值
	public static void say(){
		System.out.println("大家好，我叫WKJ");
		return; //1.结束方法的执行
	}
	
	
}












