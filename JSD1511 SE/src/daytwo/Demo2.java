package daytwo;

public class Demo2 {
	private int num;
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.num=2;
		update(d);
		System.out.println(d.num);
	}
	public static void update(Demo2 d){
		d.num=3;
	}
}
