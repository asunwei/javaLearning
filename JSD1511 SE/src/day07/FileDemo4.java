package day07;

import java.io.File;

/**
 * ʹ��File��ȡ���ʾ��Ŀ¼�е���������
 * һ��Ŀ¼�������޷ǻ����ļ���Ŀ¼
 * @author Administrator
 *
 */
public class FileDemo4 {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼����������
		 */
		File dir=new File(".");
		/*
		 * File[] listFile()
		 * ����ǰĿ¼�������������File�����ʾ��
		 * ����һ������󷵻�
		 */
		File[] subs=dir.listFiles();
		for(File sub:subs){
			/*
			 * �жϵ�ǰFile�����ʾ���Ƿ�Ϊһ���ļ�
			 */
			if(sub.isFile()){
				System.out.print("�ļ���");
			}
			if(sub.isDirectory()){
				System.out.print("Ŀ¼��");
			}
			System.out.println(sub.getName());
		}
	}
}
