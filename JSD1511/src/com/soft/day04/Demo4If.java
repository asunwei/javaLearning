package com.soft.day04;

import java.util.Scanner;
public class Demo4If {
	public static void main(String[] args) {
		//test();
//		test2();
//		test3();
//		test4(101);
//		System.out.println(test5(2015));
		System.out.println(test6(3838));
	}
	public static void test(){//�����test����
		int price=150;//������Ʒ�ĵ���
		if(price <50){
			System.out.println("���Թ������Ʒ");
		}else{
			System.out.println("̫��������");
		}
		
	}
	/**�ӿ���̨����һ������Scanner��
		����������>120 ��������أ���Ҫ����
		����������<120 �����ͦ�ã�����Ҫ����*/
	public static void test2(){
		Scanner sc=new Scanner(System.in);
		System.out.println("�ڿ���̨����������");
		int x=sc.nextInt();
		if(x>=120){
			System.out.println("���أ���Ҫ����");
		}else{
			System.out.println("ͦ�ã�����Ҫ����");
		}
	}
/**
 * ���ٷ��Ƶķ���ת����ABCDE�ȼ����
90-100	A
80-89 	B
70-79	C
60-69	D
60-��	E
 * */
	public static void test3(){
		Scanner sc =new Scanner(System.in);
		System.out.println("���������");
		int x=sc.nextInt();
		if(90<=x && x<=100){
			System.out.println("A");
		}else if(80<=x && x<=89){
			System.out.println("B");
		}else if(70<=x && x<=79){
			System.out.println("C");
		}else if(60<=x && x<=69){
			System.out.println("D");
		}else{
			System.out.println("E");
		}
	}
	public static void test4(int x){
		if(x>100 || x<0){
			System.out.println("����ɼ�����");
			}else if(90<=x){
			System.out.println("A");
		}else if(80<=x){
			System.out.println("B");
		}else if(70<=x){
			System.out.println("C");
		}else if(60<=x){
			System.out.println("D");
		}else{
			System.out.println("E");
		}
	}
/**�ж��Ƿ������꣨�ܱ�4���������ܱ�100�����������ܱ�
400������*/
	public static boolean test5(int year){
		//�ܱ�400����������
		if(year%400==0){
			return true;
			//�ܱ�4���������ܱ�100����������
		}else if(year%4==0 && year%100!=0){
			return true;
			// ����Ͳ�������
		}else{
		return false;
		}
	}
/**������һ��3λ���� ��������λ������������ϡ��������
   �����ֵ��
���磺387->873
 * */
	public static int test6(int n){
		if(n>999 || n<100){
			return -1;
			
		}
		int b1=n%10;//��ʾ��λ��
		int b2=n/10%10;//��ʾʮλ�ϵ���
		int b3=n/100;//��ʾ�ǰ�λ�ϵ���
		if(b3>=b2 && b2>=b1){
			return b3*100+b2*10+b1;
		}else if(b3>=b1 && b1>=b2){
			return b3*100+b1*10+b2;
		}else if(b2>=b3 && b3>=b1){
			return b2*100+b3*10+b1;
		}else if(b2>=b1 && b1>=b3){
			return b2*100+b1*10+b3;
		}else if(b1>=b2 && b2>=b3){
			return b1*100+b2*10+b3;
		}else{
		return b1*100+b3*10+b2;
		}
	}
}
