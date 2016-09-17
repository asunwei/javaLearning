package day01;

public class StringDemo02 {

	public static void main(String[] args) {
		//什么是Unicode：一个字符一个数！
		char c = 30000;
		System.out.println(c);//田
		c = 20013;
		System.out.println(c);//中
		char c1='国';
		System.out.println(c1);
		int c2='国';
		System.out.println(c2);
		System.out.println('国'); 
		System.out.println(Integer.toBinaryString((int)'国'));
		
		//字符串中封装了一个字符数组
		//字符数组中的字符就是unicdoe
		char[] chs = {30000, 20013, 22269};
		String str = new String(chs);
		System.out.println(str);
		//java 中“字符数组” 按照字符串输出！
		System.out.println(chs); 
		// 每个字符在内存中占有 16位（2字节byte）
	}
}








