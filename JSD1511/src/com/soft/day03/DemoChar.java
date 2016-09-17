package com.soft.day03;

public class DemoChar {

	/**
	 * 字符类型
	 */
	public static void main(String[] args) {
		/*unicode编码英文部分是和ASCII编码兼容的。
		 * 范围0-128，同时是英文字符和数字连续的编码*/
		/*65是int类型，把int类型的65转换成char类型。
		 * 输出会以char类型输出。
		 * 如果在输出的时候遇到(int)x这种情况，会把
		 * char类型强制转换成int类型*/
		char x=65;
		System.out.println(x);//A
		System.out.println((int)x);//65
		/*底层运算的时候，会先把A转换成int类型65，然后在
		 * 把65和int类型的2在一起计算，算出和。然后在把
		 * 计算出的和转换成char类型*/
		char a='A'+2;
		System.out.println(a);//C
		int w='d';
		System.out.println(w);
		int w2='@';
		System.out.println(w2);//64
		char c1='0';
		System.out.println(c1);//0
		char c2='中';
		System.out.println(c2);//中
		char c3='a';
		System.out.println(c3);//a
		//unicode有时候找不到相对应的数字
		char c4=65535;
		System.out.println(c4);//? 田字格
	}

}

