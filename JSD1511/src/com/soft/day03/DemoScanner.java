package com.soft.day03;
import java.util.Scanner;
public class DemoScanner {
	/**
	 *����̨����
	 */
	public static void main(String[] args) {
		/*������ݼ�:Ctrl+Shift+o*/
		Scanner sc=new Scanner(System.in);
		//�������ǿ���̨�������ʾ
		System.out.println("������䣺");
		//�ӿ���̨����һ���������ݸ�age����Ϊage��ֵ
		int age=sc.nextInt();
		System.out.println("�����ǣ�"+age+"��");
		System.out.println("����һ����");
		double n=sc.nextDouble();
		/*n�ǿ���̨�����һ���������ݸ�n��Ϊn��ֵ��
		 * Math.pow�Ǽ�����У���ѧ������ƽ�����ķ���*/
		n=Math.pow(n, 2);
		System.out.println(n);
	}

}
