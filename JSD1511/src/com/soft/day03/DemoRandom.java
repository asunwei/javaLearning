package com.soft.day03;
import java.util.Random;
public class DemoRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*����һ�������������Ϊrandom�����´����Ĳ�����
		 * ���������random*/
		Random random=new Random();
		/*���������0-50�����������ݸ�a��Ϊa��ֵ*/
		int a=random.nextInt(50);//���������50��[0,50)
		//char c=(char)('a'+a);//��ӡc�����Ϊ26����ĸ��
		System.out.println(a);
	}

}
