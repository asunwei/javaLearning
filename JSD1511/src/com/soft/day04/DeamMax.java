package com.soft.day04;

import java.util.Scanner;

public class DeamMax {
	
	public static void main(String[] args) {
		//�ӿ���̨����һ���� �����ݸ�sc
		Scanner sc=new Scanner(System.in);
		//�����ʾ���
		System.out.println("����һ������");
		//�ӿ���̨������һ��x��ֵ
		int x=sc.nextInt();
		//��ʾ�������
		System.out.println("����һ����");
		//�ӿ���̨����������ݸ�y��Ϊy��ֵ
		int y=sc.nextInt();
		//�ж� x>y ��true ���x��ֵ���������y��ֵ��
		int c=x>y?x:y;
		System.out.println(c);
		//ֱ�����
		int x1=15;
		int y1=13;
		int c1=x1>y1?x1:y1;
		System.out.println(c1);
	}

}
