package day01;

public class StringDemo04 {
	/**
	 * S 称为字符串常量！
	 * "ABC" 称为字符串字面量
	 * S = "ABC" 利用字面量初始化常量！
	 */
	public static final String S = "ABC";
	public static void main(String[] args) {
		/*
		 * 字符串字面量
		 */
		String s1 = "ABC";
		/*
		 * S 和 s1 用于同一个对象，重用同一个
		 * 字符串对象！性能好！
		 */
		System.out.println(S == s1);//true
	}

}
