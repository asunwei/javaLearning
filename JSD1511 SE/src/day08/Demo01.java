package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		/*
		 * new FOS() ����д�ķ�ʽ���ļ�
		 * ����ļ������ڣ����Զ������ļ������û��
		 * Ȩ�޴����ļ������Զ��׳��쳣��ʧ�ܣ�
		 * ����ļ��Ѿ����ڣ�����ļ�����ɾ���滻��
		 */
		FileOutputStream out=new FileOutputStream("demo.dat");
		/*
		 * ������int��Ϊbyteд���ļ��У�Ҳ����
		 * int��32λ���ݣ�ֻ�е�8λ��byte��д���ļ�
		 * �У���24λ����
		 */
		out.write(65);
		out.write(66);
		/*
		 * ��byte'�����е����ݳ���
		 * һ��д���ļ���
		 */
		byte[] buf={65,66};
		byte[] buf1={67,68,69,70};
		out.write(buf);
		out.write(buf1);
		/*
		 * �ļ�����رգ�
		 */
		out.close();
		
	}
}
