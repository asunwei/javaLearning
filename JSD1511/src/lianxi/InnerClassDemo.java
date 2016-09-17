package lianxi;

public class InnerClassDemo {
	public static void main(String[] args) {
		Mama m=new Mama();
		//Baby a=new Baby();
		
	}
}
class Mama{
	private String name;
	Baby creatBaby(){
		return new Baby();
	}
	class Baby{
		void showMama(){
			System.out.println(name);
			System.out.println(Mama.this.name);
		}
		
	}
}