package day01;
/**
 * 这是一个演示案例!
 * @author 刘苍松
 */
public class JavaDocDemo {
	/**
	 * 这是软件的入口方法
	 * @param args 
	 */
	public static void main(String[] args) {
		String s = "Hello";
		print(s);
	}
	/**
	 * 输出字符串的方法
	 * @param str 被输出的字符串对象
	 */
	public static void print(String str){
		System.out.println(str); 
	}
	
}
