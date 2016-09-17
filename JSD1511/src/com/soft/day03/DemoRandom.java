package com.soft.day03;
import java.util.Random;
public class DemoRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*定义一个随机数变量名为random，把新创建的产生的
		 * 随机数传给random*/
		Random random=new Random();
		/*随机产生的0-50的整数，传递给a作为a的值*/
		int a=random.nextInt(50);//随机产生的50数[0,50)
		//char c=(char)('a'+a);//打印c，结果为26个字母，
		System.out.println(a);
	}

}
