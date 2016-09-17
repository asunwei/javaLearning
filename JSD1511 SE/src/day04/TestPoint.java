package day04;

public class TestPoint {

	/**
	 * 测试泛型使用
	 * @param args
	 */
	public static void main(String[] args) {
		Point<Integer> p1=new Point<Integer>(1,2);
		p1.setX(2);
		int x1=p1.getX();
		System.out.println(p1);
		Point<Double> p2=new Point<Double>(1.1,2.2);
		p2.setX(1.1);
		double x2=p2.getX();
		System.out.println(p2);
		Point<String> p3=new Point<String>("一","二");
		p3.setX("1");
		String x3=p3.getX();
		System.out.println(p3);
	}

}
