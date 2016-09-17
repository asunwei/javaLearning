package day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo05 {
	public static void main(String[] args)throws Exception {
		String src="D:/music.mp3";
		String dsc="D:/music_copy.mp3";
		//打开源文件
		/*
		 * 将文件打开为基本流
		 */
		FileInputStream fis=new FileInputStream(src);
		/*
		 * 为基本流的缓冲流
		 * 后续逻辑无需改变，后续使用缓冲流
		 * 就可以提速
		 */
		BufferedInputStream in=new BufferedInputStream(fis);
		/*
		 * 打开基本输出流
		 */
		FileOutputStream fos=new FileOutputStream(dsc);
		/*
		 * 在基本输出流的基础上扩展缓存输出流
		 */
		BufferedOutputStream out=new BufferedOutputStream(fos);
		long start=System.currentTimeMillis();
		int b;
		while((b=in.read())!=-1){
			out.write(b);//从in读取每个byte写到out去
		}
		long end=System.currentTimeMillis();
		in.close();
		out.close();
		System.out.println("复制成功!耗时："+(end-start)+"毫秒");
	}
}