package oo.day06;

public class NstClassDemo {
	public static void main(String[] args) {
	//Inter2 o1=new Inter2();//接口不能被实例化	
		//1.创建了一个Iner2的一个子类，没有名字
		//2.为子类穿件一个对象，名为o1
		//3.大括号中的为子类的类体
		Inter2 o2=new Inter2(){
			
		};
		
		Inter3 o3=new Inter3(){
			public void run(){
				System.out.println("abc");
				
			}
		};
		o3.run();
	}
}
interface Inter3{
	public void run();
}

interface Inter2{
	
}