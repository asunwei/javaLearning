package oo.day03;
//super��ʾ
public class SuperDemo {
	public static void main(String[] args) {
		Boo a = new Boo(2,3,new Person());
		Aoo c = a;
		c.test();
		
	}
}

class Aoo{
	Person p1;
	private int a;
	public void test(){
		System.out.println("�����test����....");
	}
	Aoo(int a){
		this.a = a;
	}
}
//class Boo extends Aoo{
	
//}
class Boo extends Aoo{
	protected int b;
	Person p2;
	Boo(int a,int b,Person p2) {
		super(a);
		this.b = b;
		this .p2= p2;
	}
	
	public void test(){
		System.out.println("�����test����");
	}
}


class Person {
	private String age;
	public String addresss;
	String tel;
	public void mes(){
		System.out.println("haohaoxuexi");
	}
}






