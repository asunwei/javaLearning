package day06;

import java.io.File;

/**
 * ʹ��Fileɾ�������ļ�
 * @author Administrator
 *
 */
public class FileDemo3 {
	public static void main(String[] args) {
		/*
		 * ɾ�������ļ��µ�demo.txt
		 */
		File file=new File("demo.txt");
		if(file.exists()){
			//ɾ��file��ʾ���ļ�
			file.delete();
			System.out.println("ɾ����ϣ�");
		}
	}
}
