package com.soft.day03;

public class DemoInt {//����һ��DemoInt����
	/**
	 * ����������ʾ
	 */
	public static void main(String[] args) {
		//byte mybyte=128;//�����������ݷ�Χ
		//����һ��byte���͵ı�������ֵ
		byte myByte=127;
		//����һ��short���͵ı�������ֵ
		short myShort=-32768;
		int myInt=214748364;
		long myLong=1212312312312L;
		//����4�����͵ĺ�
		long re=myLong+myByte+myInt+myShort;
		System.out.println("�����: "+re);
		
	}

}

