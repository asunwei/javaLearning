package day07;

import java.io.File;

/**
 * 删除目录
 * @author Administrator
 *
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File dir =new File("demo");
		if(dir.exists()){
			/*
			 * 若当前目录中含有子项，该目录不能删除
			 */
			dir.delete();
			System.out.println("删除完毕");
		}
	}
}
