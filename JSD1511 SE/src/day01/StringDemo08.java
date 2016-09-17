package day01;

public class StringDemo08 {

	public static void main(String[] args) {
		String str = "您好Java！";
		/*
		 * Java String 存储的是字符数据，每个字符
		 * 都是16位的char类型。每个char 2个字节
		 * str.length() 返回字符的个数(不是字节数)
		 */
		System.out.println(str.length());
		/*
		 * "您好Java！"字符串在内存中占有 14个字节
		 * length * 2 = 字节个数！ 
		 */
	}

}





