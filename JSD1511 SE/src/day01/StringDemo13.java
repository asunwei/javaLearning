package day01;

public class StringDemo13 {

	public static void main(String[] args) {
		String str = "\n\t\u0007 中国 ";
		/*
		 * 去除字符串两端的空白(c<32的字符)
		 * 返回新字符串，原字符串不变！
		 */
		String n = str.trim();
		System.out.println(n); 
		System.out.println(str); 
		/*
		 * 注意: 如果没有需要去除的空白，则返回
		 * 原有的字符串！（性能好！）
		 */
		String name = "Tom";
		String x = name.trim();
		System.out.println(x == name); 
		/*
		 * 何时使用：清理用户输入信息时候使用
		 *  name = "  Tom  "
		 *  name = name.trim()
		 */
		
	}
}




