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
		 * 删除指定File表示的文件或目录
		 */
		public static void delete(File file){
		
			if(file.isDirectory()){
				//当前目录下的所有子项先删除
				for(File sub:file.listFiles()){
					delete(sub);
				}
			}
			file.delete();
		}
		
}
