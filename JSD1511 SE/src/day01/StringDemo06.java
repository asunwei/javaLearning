package day01;

public class StringDemo06 {

	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = "ABC";
		String s3 = "A";
		String s4 = "BC";
		String s5 = s3+s4;//变量连接！
		/*
		 * s2 不会重用 new String("ABC")创建的
		 * 对象，s1 和 s2 引用了 不同的对象
		 * s1和s2的值不相同！
		 * s5 引用的是字符串变量连接的结果
		 * 也不参与字符串重用！
		 */
		System.out.println(s1==s2);//false
		System.out.println(s5==s2);//false
		System.out.println(s1);
		System.out.println(s2);
	}

}
