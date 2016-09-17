
public class StringDemo {
	public static void main(String[] args) {
		char c=30000;
		System.out.println(c);
		c=20013;
		System.out.println(c);
		System.out.println((int)'国');
		System.out.println((int)'孙');
		System.out.println((int)'威');
		//字符中分装了一个字符数组
		//字符数组中的字符就是unicode
		char[] chs ={'孙','威'};
		String str=new String(chs);
		System.out.println(str);
		//java中的“字符数组”按照字符串输出
		//每个字符在内存中占16位（2字节）
		System.out.println((int)'杨');
		System.out.println((int)'郑');
	}

}
