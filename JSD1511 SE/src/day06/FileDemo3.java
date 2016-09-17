package day06;

import java.io.File;

/**
 * 使用File删除现有文件
 * @author Administrator
 *
 */
public class FileDemo3 {
	public static void main(String[] args) {
		/*
		 * 删除现有文件下的demo.txt
		 */
		File file=new File("demo.txt");
		if(file.exists()){
			//删除file表示的文件
			file.delete();
			System.out.println("删除完毕！");
		}
	}
}
