package day07;

import java.io.File;

/**
 * 
 * @author Administrator
 *
 */
public class FileDemo6 {
	public static void main(String[] args) {
		File dir=new File("a");
		delete(dir);
	}
		
		/*
		 * ɾ��ָ��File��ʾ���ļ���Ŀ¼
		 */
		public static void delete(File file){
		
			if(file.isDirectory()){
				//��ǰĿ¼�µ�����������ɾ��
				for(File sub:file.listFiles()){
					delete(sub);
				}
			}
			file.delete();
		}
		
}
