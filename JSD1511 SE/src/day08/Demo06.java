package day08;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Demo06 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("test.dat");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int i=0;
		/*while(i>9000){
			bos.write(66);
			i++;
		}*/
		bos.write(66);
		bos.write(65);
		/*
		 * flush����ջ������������������ݿɿ�д���ײ�������
		 * ���ر��ļ���flush�����Ժ���Լ������ļ�д����
		 */
		bos.flush();
		bos.write(66);
		
		/*
		 * ����ջ������������������ݿɿ�д��
		 * �ײ��ֽ����У����ҹر��ļ�
		 * ������ر��ļ����������е����ݿ��ܱ�����
		 */
		/*bos.close();*/
		System.out.println("���");
	}
}
