package day03;
/*
 * 包装类支持一个静态方法parseXXX(String str)
 * 作用是将字符串转换为基本的基本类型
 * 前提是该字符串必须正确的描述要转换的基本类型的值
 */
public class NumberDemo3 {
	public static void main(String[] args) {
		String str="123";
//		int i=Integer.valueOf(str)
		int i=Integer.parseInt(str);
		i+=1;
		System.out.println(i);
		String str1="123.123";
		double d=Double.parseDouble(str1);
		d+=1;
		System.out.println(d);
	}
}
