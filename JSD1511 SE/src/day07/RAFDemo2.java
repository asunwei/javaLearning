package day07;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ֽ�
 * @author Administrator
 *
 */
public class RAFDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("demo.dat","r");
		/*
		 * int read()
		 * �÷������ȡһ���ֽڣ��������ֽ�ת��Ϊ
		 * һ��intֵ���棬��intֵֻ�С��Ͱ�λ����Ч
		 * ����intֵ��ʾ������Ϊ-1�����ʾ��ȡ���ļ�ĩβ
		 * 
		 */
		int d=raf.read();
		System.out.println(d);
		raf.close();
	}
}
