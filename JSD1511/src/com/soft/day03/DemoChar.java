package com.soft.day03;

public class DemoChar {

	/**
	 * �ַ�����
	 */
	public static void main(String[] args) {
		/*unicode����Ӣ�Ĳ����Ǻ�ASCII������ݵġ�
		 * ��Χ0-128��ͬʱ��Ӣ���ַ������������ı���*/
		/*65��int���ͣ���int���͵�65ת����char���͡�
		 * �������char���������
		 * ����������ʱ������(int)x������������
		 * char����ǿ��ת����int����*/
		char x=65;
		System.out.println(x);//A
		System.out.println((int)x);//65
		/*�ײ������ʱ�򣬻��Ȱ�Aת����int����65��Ȼ����
		 * ��65��int���͵�2��һ����㣬����͡�Ȼ���ڰ�
		 * ������ĺ�ת����char����*/
		char a='A'+2;
		System.out.println(a);//C
		int w='d';
		System.out.println(w);
		int w2='@';
		System.out.println(w2);//64
		char c1='0';
		System.out.println(c1);//0
		char c2='��';
		System.out.println(c2);//��
		char c3='a';
		System.out.println(c3);//a
		//unicode��ʱ���Ҳ������Ӧ������
		char c4=65535;
		System.out.println(c4);//? ���ָ�
	}

}

