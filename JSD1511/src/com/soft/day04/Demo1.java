package com.soft.day04;

import java.util.Scanner;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x=new Scanner(System.in);
		System.out.println("��������������");
		//����̨���������
		int a=x.nextInt();
		//�涨ÿҳ��ʾ10������
		int b=10;
		/*a=23 int a=a/b=2  a/b+1*/
		int c=a%b==0?a/b:a/b+1;
		
		System.out.println("��Ҫҳ����"+c);
	}

}

