package day07;

import java.io.File;
import java.io.FileFilter;

/**
 * File的listFile方法有一个重载
 * 允许我们指定的一个文件过滤器，然后将File表示的目录下满足
 * 过滤器要求的子项获取回来
 * @author Administrator
 *
 */
public class FileDemo5 {
	public static void main(String[] args) {
		File dir=new File(".");
		/*
		 * 获取当前目录下所有名字以“.”开头的子项
		 * FileFilter是一个接口，有一个抽象方法accept，
		 * 该方法的作用是定义过滤条件
		 */
		FileFilter filter=new FileFilter(){
			public boolean accept(File file){
				String name=file.getName();
				System.out.println("正在过滤："+name);
				return name.startsWith(".");
			}
		};
		File[] subs=dir.listFiles(filter);
		for(File sub:subs){
			System.out.println(sub.getName());
		}
	}
}
