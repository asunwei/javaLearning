package day06;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��file�����ļ�
 * @author Administrator
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰ��Ŀ��Ŀ¼�´����ļ�demo.txt
		 */
		File file=new File("demo.txt");
		if(!file.exists()){
			System.out.println("������");
			//����file��ʾ���ļ�
			file.createNewFile();
			System.out.println("�������");
		}
	}
}
