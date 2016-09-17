package day01;

public class StringDemo05 {

	public static void main(String[] args) {
		String s1 = "A"+"BC";
		String s2 = "AB"+"C";
		//String s3 = S + "BC";
		/*
		 * 字面量(常量)的运算结果一样时候也重用
		 * 为同一个字符串对象！
		 */
		System.out.println(s1==s2);//true
	}

}
