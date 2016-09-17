package day01;

public class StringDemo03 {

	public static void main(String[] args) {
		//"ABC" 字符串字面量(直接量)
		//直接写的量.
		//Java 优化了静态字符串字面量(直接量)
		//使其优化为同一个对象的引用
		// 如下代码中 s1 和 s2 引用了同一个对象
		// s1和s2的值(地址值)相等！
		String s1 = "ABC";
		String s2 = "ABC";
		//如果s1==s2结果是true，说明引用值相等
		//（地址相同）也就是它们引用同一个String对象
		System.out.println(s1==s2);
		//注意：== 用于比较“两个变量”是否相等
		int a = 5;
		int b = 5;
		System.out.println(a==b);//true
		
		
		
		 
	}

}
