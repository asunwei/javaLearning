package oo.day06;
//匿名内部类演示
public class NstClassDemo {
	public static void main(String[] args) {
		//Inter2 o1 = new Inter2(); //编译错误，接口不能被实例化
		
		//1.创建了Inter2的一个子类，没有名字
		//2.为该子类创建了一个对象，名为o1
		//3.大括号中的为子类的类体
		Inter2 o1 = new Inter2(){

		};
		
		//1.创建了Inter2的一个子类，没有名字
		//2.为该子类创建了一个对象，名为o2
		//3.大括号中的为子类的类体
		Inter2 o2 = new Inter2(){
			
		};
		
		
		final int num=250;
		Inter3 o3 = new Inter3(){
			public void run(){
				System.out.println("abc");
				System.out.println(num); //num必须是final的
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




