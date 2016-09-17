package day07;

import java.io.File;

/**
 * 使用File创建多级目录
 * @author Administrator
 *
 */
public class FileDemo2 {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建目录a/b/c/d/e/f
		 */
		File dir=new File("a"+File.separator+"b"+File.separator+"c"+File.separator
				          +"d"+File.separator+"f");
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("创建完毕！");
		}
	}
}
