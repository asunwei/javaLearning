package day07;

import java.io.File;
import java.io.FileFilter;

/**
 * File��listFile������һ������
 * ��������ָ����һ���ļ���������Ȼ��File��ʾ��Ŀ¼������
 * ������Ҫ��������ȡ����
 * @author Administrator
 *
 */
public class FileDemo5 {
	public static void main(String[] args) {
		File dir=new File(".");
		/*
		 * ��ȡ��ǰĿ¼�����������ԡ�.����ͷ������
		 * FileFilter��һ���ӿڣ���һ�����󷽷�accept��
		 * �÷����������Ƕ����������
		 */
		FileFilter filter=new FileFilter(){
			public boolean accept(File file){
				String name=file.getName();
				System.out.println("���ڹ��ˣ�"+name);
				return name.startsWith(".");
			}
		};
		File[] subs=dir.listFiles(filter);
		for(File sub:subs){
			System.out.println(sub.getName());
		}
	}
}
