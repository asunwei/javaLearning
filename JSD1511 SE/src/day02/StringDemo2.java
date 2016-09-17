package day02;
/**
 * 字符串支持正则表达式的方法一
 * boolean matches（String regex）
 * 判断当前字符串是否满足给定正则表达式所要求的
 * 格式,满足返回true，否则false
 * */
public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 * */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z])+";
		String email="fancq_@tedu.com";
		boolean matches=email.matches(regex);
		if(matches){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
	}

}
