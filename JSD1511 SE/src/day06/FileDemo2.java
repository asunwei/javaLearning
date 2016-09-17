package day06;

import java.io.File;
import java.io.IOException;

/**
 * 使用file创建文件
 * @author Administrator
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 在当前项目根目录下创建文件demo.txt
		 */
		File file=new File("demo.txt");
		if(!file.exists()){
			System.out.println("不存在");
			//创建file表示的文件
			file.createNewFile();
			System.out.println("创建完毕");
		}
	}
}
