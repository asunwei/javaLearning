package day01;

public class StringDemo14 {

	public static void main(String[] args) {
		String str = "画上荷花和尚画";
		//            0 1 2 3
		char c = str.charAt(2);
		System.out.println(c);
		/*
		 * charAt可以与for循环配合，遍历处理
		 * 字符串中全部的字符。
		 * 需求: 输出一个字符串中字符的编码。 
		 */
		str = "梦里不知身是客";
		for(int i=0; i<str.length(); i++){
			// i = 0 1 2 3 4 ...length-1
			// i 代表每个字符的位置
			char ch = str.charAt(i); 
			//ch 代表字符串中的每个字符
			System.out.println(ch); 
		}
		
	}
}







