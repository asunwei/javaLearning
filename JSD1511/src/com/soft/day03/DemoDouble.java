package com.soft.day03;

public class DemoDouble {

	/**
	 * ��������
	 */
	public static void main(String[] args) {
		int a=0x7fffffff;//a������int�������ֵ
		int b=0x7ffffff0;//b�����Ǳ�aС15����
		System.out.println(a);
		System.out.println(b);
		float fa=a;//��int����a�����ֵ���ݸ�fa
		float fb=b;//��int����b��ֵ���ݸ�fb
		 System.out.println("fa�Ľ���� ��"+fa);
		 System.out.println("fb�Ľ���� : "+fb);
	double da=a;//��int����a��ֵ���ݸ�double����da
	double db=b;//��int����b��ֵ���ݸ�double����db
	System.out.println("da�Ľ���� ��"+da);
	System.out.println("db�Ľ���� ��"+db);
	}

}

