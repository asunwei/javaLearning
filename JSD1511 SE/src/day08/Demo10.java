package day08;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * �ַ���д�ļ�
 * @author Administrator
 *
 */
public class Demo10 {
	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("demo.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		/*
		 * write���Զ���Ӣ��'A'����Ϊ1��byte����д��
		 * �ײ���ļ���
		 */
		osw.write('A');
		/*
		 * write ���Զ���Ӣ�ġ��С�����Ϊ�����ֽ�д���ײ�
		 * ���ļ���
		 */
		osw.write('��');
		osw.write("���ڿƼ�");
		osw.close();
		System.out.println("��ϣ�");
	}
}
