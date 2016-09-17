package day07;

import java.io.File;

/**
 * 使用File获取其表示的目录中的所有子项
 * 一个目录的子项无非还是文件货目录
 * @author Administrator
 *
 */
public class FileDemo4 {
	public static void main(String[] args) {
		/*
		 * 获取当前目录下所有子项
		 */
		File dir=new File(".");
		/*
		 * File[] listFile()
		 * 将当前目录中所有子项（若干File对象表示）
		 * 存入一个数组后返回
		 */
		File[] subs=dir.listFiles();
		for(File sub:subs){
			/*
			 * 判断当前File对象表示的是否为一个文件
			 */
			if(sub.isFile()){
				System.out.print("文件：");
			}
			if(sub.isDirectory()){
				System.out.print("目录：");
			}
			System.out.println(sub.getName());
		}
	}
}
