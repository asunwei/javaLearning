package day02;

public class TestPoint {

	/**
	 * 测试Object中定义的方法
	 * @param args
	 */
	public static void main(String[] args) {
		Point p=new Point(1,2);
		/*
		 * 若我们不重写Object的toString方法
		 * 返回的字符串的意义不大，因为该字符串描述的
		 * 是当前对象的内存地址信息，格式：
		 * 类名@地址
		 * 这种格式也称为“句柄”
		 * */
//		String str=p.toString();
//		System.out.println(str);
		/*
		 * System.out .println(Object 0）；
		 * 该方法会将给定的对象的toString方法
		 * 返回的字符串输出到控制台
		 * */
		System.out.println(p);
		
		Point p2=new Point(1,2);
		System.out.println(p2);
		System.out.println(p==p2);
		System.out.println(p.equals(p2));
		
	}

}
