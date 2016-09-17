package day04;

public class TestPoint4 {

	/**
	 * 泛型的原型是Object
	 * 泛型只是告知应当将泛型的类型当作什么看待而已
	 * 这样设置值时编译器会帮助检查实参类型与泛型是否一致
	 * 并且泛型值的时候会自动造
	 * @param args
	 */
	public static void main(String[] args) {
		Point<Integer> p1=new Point<Integer>(1,2);
		int x1=p1.getX();
		System.out.println("x1:"+x1);
		//不指定泛型，则泛型为原型Object
		Point p2=p1;
		p2.setX("一");
		String x2=(String)p2.getX();
		System.out.println("x2:"+x2);
		//ClassCastException
		x1=p1.getX();
		System.out.println("x1:"+x1);
	}

}
