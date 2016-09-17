package day01;

public class StringDemo18 {

	public static void main(String[] args) {
		String s1 = 123+"ABC";
		double pi = 3.1415926535897932384;
		String s2 = "PI:"+pi; 
		System.out.println(s1 + " " + s2);

		//任何数据与字符串连接时候，利用
		// String.valueOf()方法将数据转换字符串
		// 再与字符串进行连接。
		//如下代码与上面代码是等价的：
		s1 = String.valueOf(123)+"ABC";
		//s1 = String.valueOf(int)+"ABC";
		s2 = "PI:"+String.valueOf(pi);
		//                        double 
		System.out.println(s1 + " " + s2);
		/*
		 * String.valueOf(数据) 将任何类型转换
		 * 为字符串类型！
		 * valueOf 是一系列重载方法组成
		 * 
		 * valueOf 在需要将一个数字转换为字符串
		 * 的时候，可以调用这个方法
		 */
		//int score=2417;
		//g.drawString(
		// "Screo:"+String.valueOf(score),x,y);
		String s = String.valueOf(123)+
				String.valueOf(pi);
		System.out.println(s); 
	}

}





