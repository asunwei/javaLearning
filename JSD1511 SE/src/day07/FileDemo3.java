package day07;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * @author Administrator
 *
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File dir =new File("demo");
		if(dir.exists()){
			/*
			 * ����ǰĿ¼�к��������Ŀ¼����ɾ��
			 */
			dir.delete();
			System.out.println("ɾ�����");
		}
	}
}
