package day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * ����һ�������Զ���ˢ�µĻ����ַ���
 * ���췽����һ��������������
 * @author Administrator
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos=new FileOutputStream("pw1.txt");
		/*
		 * ����һ������Ϊ��ʱ������֧��һ��boolean
		 * ���͵ĵڶ�����������ֵΪtureʱ����ô�;���
		 * �Զ���ˢ�¹���
		 */
		PrintWriter pw=new PrintWriter(fos,true);
		/*
		 * ÿ��ʹ��println����д���ַ�����ʱ�򣬾ͻ��Զ�flush
		 * ע�����print���������Զ���ˢ��
		 */
		pw.println("ҹ��������������");
		pw.println("�ܷ�����");
		System.out.println("д����ϣ�");
		pw.close();
	}
}
