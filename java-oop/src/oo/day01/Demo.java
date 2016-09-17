package oo.day01;
//引用类型画等号、null
public class Demo {
	public static void main(String[] args) {
		Cell c1 = new Cell();
		Cell c2 = c1; //指向同一个对象
		c1.row = 2;
		c2.row = 5;
		System.out.println(c1.row); //5
		
		c1 = null; //空，不指向任何对象
		System.out.println(c1.row); //NullPointerException空指针异常
	}
}












