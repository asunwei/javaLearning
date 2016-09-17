package day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		String src="D:/music.mp3";
		String dcr="D:/music_copy2.mp3";
		FileInputStream in=new FileInputStream(src);
		FileOutputStream out=new FileOutputStream(dcr);
		/*
		 * 利用8K byte 缓冲区加快文件IO
		 */
		long start=System.currentTimeMillis();
		byte[] buf=new byte[1024*8];
		int n;
		while((n=in.read(buf))!=-1){
			out.write(buf,0,n);
		}
		long end=System.currentTimeMillis();
		System.out.println("复制完毕,耗时："+(end-start)+"毫秒");
	}
}
