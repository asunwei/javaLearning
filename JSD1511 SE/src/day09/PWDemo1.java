package day09;

import java.io.PrintWriter;

/**
 * java .io.PrintWriter
 * �����Զ�ˢ�µĻ����ַ�������������ڽ�BufferedWriter,
 * ������߱����幦��
 * @author Administrator
 *
 */
public class PWDemo1 {
	public static void main(String[] args)throws Exception {
		/*
		 * PrintWriter�ṩ��ֱ�Ӳ����ļ���
		 * ���췽��
		 * PrintWruter(File file)
		 * PrintWriter(String fileName)
		 */
		PrintWriter pw=new PrintWriter("pw.txt");
		//���ø÷��������Զ�д������
		pw.println("�Ұ������찲��");
		pw.println("�찲����̫����");
		
		System.out.println("д����ϣ�");
		pw.close();
	}
}
