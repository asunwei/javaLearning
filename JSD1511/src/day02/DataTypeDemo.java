package day02;

//数据类型的演示
public class DataTypeDemo {
	public static void main(String[] args) {
		
		/*
		 * 数据类型转换的练习:
		 * 1.声明整型变量a并赋值为250
		 *   声明长整型变量b并赋值为a
		 *   声明整型变量c并赋值为b
		 * 2.声明长整型变量d并赋值为100亿
		 *   声明整型变量e并赋值为d，输出e的值
		 * 3.声明浮点型变量f并赋值为25.678
		 *   声明整型变量g并赋值为f，输出g的值
		 * 4.声明byte型变量b1并赋值为5
		 *   声明byte型变量b2并赋值为6
		 *   声明byte型变量b3并赋值为b1+b2
		 */
		
		/*
		//数据类型的转换
		int a=5;
		long b=a; //自动类型转换
		int c=(int)b; //强制类型转换
		
		long d=5; //自动类型转换
		double e=5; //自动类型转换
		float f=(float)5.678; //强制类型转换
		
		long g = 10000000000L;
		int h = (int)g;
		System.out.println(h); //溢出，强转有可能会溢出
		
		double i = 56.987456;
		int j = (int)i;
		System.out.println(j); //56，强转有可能会精度丢失
		
		//多种类型参与运算时，系统自动向较大的类型转换
		int k=5/2;
		System.out.println(k); //2
		double l=5/2;
		System.out.println(l); //2.0，5/2的结果为int型的2，自动类型转
		double m=5/2.0;
		System.out.println(m); //2.5，5.0/2的结果为double型，所以能保留小数位
		
		//两点规则:
		//1)整数直接量可以直接赋值给byte,short,char，
		//  但不能超范围
		//2)byte,short,char型变量参与运算时，
		//  先一律转换为int再运算
		short b1 = 5;
		short b2 = 6;
		short b3 = (short)(b1+b2);
		System.out.println(b3);
		*/
		
		
		
		
		/*
		 * boolean、char的练习:
		 * 1.声明布尔型变量b1并赋值为true
		 *   声明布尔型变量b2并赋值为false
		 *   声明布尔型变量b3并赋值为25------???
		 * 2.声明字符型变量c1并赋值为字符男
		 *   声明字符型变量c2并赋值为字符m
		 *   声明字符型变量c3并赋值为字符8
		 *   声明字符型变量c4并赋值为空格符
		 *   声明字符型变量c5并赋值为你好------???
		 * 3.声明字符型变量c6并赋值为97，输出c6的值
		 *   声明字符型变量c7并赋值为'，输出c7的值
		 *   输出2+2的值，输出'2'+'2'的值
		 */
	
		/*
		//5.char:字符型，2个字节
		char c1 = '中';
		char c2 = 'a';
		char c3 = '1';
		char c4 = ' ';
		//char c5 = ''; //编译错误，必须有字符
		//char c6 = '男性'; //编译错误，只能有一个字符
		
		char c7 = 65;
		System.out.println(c7); //A
		
		char c8 = '\'';
		System.out.println(c8); //'
		
		System.out.println(2+2); //4
		System.out.println('2'+'2'); //100,'2'的码50加上'2'的码50，结果为100
		System.out.println(2+'2'); //52,2加上'2'的码50，结果为52
		*/
		
		
		/*
		//4.boolean:布尔型，1个字节，只能取值为true和false
		boolean b1 = true; //声明布尔型变量b1并赋值为true
		boolean b2 = false;
		//boolean b3 = 250; //编译错误，数据类型不匹配
		*/
		
		
		
		
		
		
		
		
		
		
		/*
		 * int,long,double练习:
		 * 1.声明整型变量a并赋值为250
		 *   声明整型变量b并赋值为100亿-----???
		 *   输出5/2的值，输出4/5的值
		 *   声明整型变量c并赋值为2147483647
		 *     给c本身增1，输出c的值
		 * 2.声明长整型变量d并赋值为100亿----???，怎么改
		 *   声明长整型变量e并赋值为10亿*2*10L，输出e的值
		 *   声明长整型变量f并赋值为10亿*3*10L，输出f的值
		 *   声明长整型变量g并赋值为10亿L*3*10，输出g的值
		 *   声明长整型变量h赋值为System.currentTimeMillis()
		 *     输出h的值
		 * 3.声明浮点型变量i并赋值为25.678
		 *   声明浮点型变量j和k，并分别赋值为6.0和4.9，
		 *     输出j-k的值  
		 */
		
		/*
		//3.double:浮点型，8个字节
		double a=25.678; //25.678为浮点型直接量，默认为double型
		float b=25.678F; //25.678F为float型直接量
		
		double c=3.0;
		double d=2.9;
		System.out.println(c-d); //0.10000000000000009，舍入误差
		*/
		
		/*
		//2.long:长整型，8个字节，很大很大
		long a=250L; //250L叫长整型直接量
		//long b=10000000000; //编译错误，100亿为int型，但超范围了
		long c=10000000000L;
		
		//有可能超int范围时，将L写在第一个数字的后面
		long d = 1000000000*2*10L;
		System.out.println(d); //200亿
		long e = 1000000000*3*10L;
		System.out.println(e); //溢出了
		long f = 1000000000L*3*10;
		System.out.println(f); //300亿
		
		//获取自1970.1.1零时到此时此刻的毫秒数
		long g = System.currentTimeMillis();
		System.out.println(g);
		*/
		
		/*
		//1.int:整型，4个字节，-21个多亿到21个多亿
		int a=250; //250叫整数直接量，默认为int型
		//int b=10000000000; //编译错误，100亿默认为int型，但超出int范围了
		
		System.out.println(5/2); //2，两个整数相除，结果还是整数，小数位被舍弃了
		System.out.println(2/5); //0，小数位被舍弃了
		
		int c = 2147483647;
		c=c+1;
		System.out.println(c); //-2147483647，溢出了，是需要被避免的
		*/
	}
}















