package com.soft.day03;

public class DemoExams {

	/**
	 * ��������
	 */
	public static void main(String[] args) {
	/**1��ȡ��a��ֵΪ1����ֵ��1�ı�����Ϊa++���ʽ��ֵ
	 * 2���ڶ�b�������㣺a++�������ʽ��ֵ��ֵ��1
	 * ��1�ĸ�ֵ��b��Ϊb��ֵ
	 * 3��Ȼ���ڽ�a����1��a��ֵ��2
	 * */
//	int a=1;
//	int b=1;
//	b=a++;//a++�Ǹ����ʽ��ֵ��1
//	System.out.println("a��ֵ:"+a+"b��ֵ"+b);
		
/*        ��һ������            */	
	/**1��a++��Ϊ�������ʽ��ֵ����ֵ���Ⱥ�ǰ��a��
	 * �Ⱥ�ǰ��a����Ľ����1��
	 * Ȼ����ȥ����a++��ֵ��a++��ֵ��2
	 * */
//		int a=1;
//		 a=a++;
//		 System.out.println(a);
/*                ��һ������*/
		int i=10;
		i++;
		System.out.println(i);//11
		++i;
		System.out.println(i);//12
		/**
		 * �ȼ���i+10=12+10=22
		 * �ڼ���i++��*/
		int x=(i++)+10;
		System.out.println(x);//22

	}

}
