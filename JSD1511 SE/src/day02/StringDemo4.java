package day02;
/*
 * 字符串支持正则表达式方法三：
 * String replaceAll（String regex，String str）
 * 将当前字符串中满足给定正则表达式的部分替换为给定的字符串
 * */
public class StringDemo4 {
	public static void main(String[] args) {
		String str="xyz123abc456def789ghi012";
		/*将字符串中的数字部分替换为“#NUMER#”
		 * */
		str=str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}
}
