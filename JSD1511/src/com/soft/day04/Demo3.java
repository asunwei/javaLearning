package com.soft.day04;

public class Demo3 {

	/**
	 * Âß¼­ÔËËã
	 */
	public static void main(String[] args) {
		int a=2;
		int b=5;
		boolean r=((a>b)&&(a!=b));
		boolean r1=((a>b)||(a!=b));
		System.out.println("(2>5)&&(2!=5)"+r);
		System.out.println("(2>5)||(2!=5)"+r1);
		System.out.println("!(5>2)"+!(5>2));
	}

}
