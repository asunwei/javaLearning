package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * �������ڶ�д�ļ�����
 * ���д�ǻ���ָ�뵱ǰλ�ý��е�
 * RAF�����ֳ��ò���ģʽ���ֱ��Ӧһ���ַ�����
 * r:ֻ��ģʽ
 * rw����дģʽ
 * @author Administrator
 *
 */
public class RAFDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * ����Ŀ��Ŀ¼�µ�demo.dat�ļ�
		 * ���ж�д����
		 */
		RandomAccessFile raf=new RandomAccessFile("demo.dat","rw");
		int i=1;
		/*
		 * void write(int i)
		 * ���ļ���д��һ���ֽڣ�д�����Ǹ�����
		 * intֵ��Ӧ�Ķ������еġ��Ͱ�λ��
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(65);
		/*
		 * �ر��ͷ���Դ
		 */
		raf.close();
	}
}
