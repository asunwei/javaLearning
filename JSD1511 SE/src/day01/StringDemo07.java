package day01;

public class StringDemo07 {

	public static void main(String[] args) {
		String s1 = "ABC"; 
		String s2 = "ABC";
		String s3 = new String("ABC");
		/*
		 * == 比较字符串是否一样是不靠谱的！ 
		 */
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		/*
		 * equals 方法才是用于比较字符串是否相等的方法
		 */
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		
	}

}
