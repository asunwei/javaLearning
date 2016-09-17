package oo.day06;
//成员内部类演示
public class InnerClassDemo {
	public static void main(String[] args) {
		Mama m = new Mama();
		m.createBaby();
		//Baby b = new Baby(); //编译错误，内部类对外不具备可见性
	}
}

class Mama{
	private String name;
	Baby createBaby(){
		return new Baby();//return Baby这个引用返回值类型的对象
	}
	public void run(){
		System.out.println("run");
	}
	class Baby{
		void Baby(){
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name); //this为当前对象，即Baby类对象，而Baby类没有name属性
			run();
		}
		
	}
}






