package day01;

public class StringDemo01 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;
		s1 = s1 + "World!";
		String s3 = "Hello";
		String s4 = new String("Hello");
		System.out.println(s2==s3);
		System.out.println(s3.equals(s4));
		System.out.println(s1);
		System.out.println(s2);
	}
}
