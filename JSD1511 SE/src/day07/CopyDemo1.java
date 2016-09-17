package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * @author Administrator
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1:创建一个RAF读取原文件
		 * 2：再创建一个RAF用于向目标文件中写
		 * 3：循环从原文件中读取每一个字节，然后将该字节的内容
		 * 写入到目标文件中，直到读到原文件的末尾
		 */
		//1
		RandomAccessFile src=new RandomAccessFile("music.mp3","r");
		//2
		RandomAccessFile desc=new RandomAccessFile("music_copy.mp3","rw");
		long star=System.currentTimeMillis();
		//3
		int d=-1;
		while((d=src.read())!=-1){
			desc.write(d);
		}
		long end=System.currentTimeMillis();
		System.out.println("复制完毕！耗时:"+(end-star)+"毫秒 ");
		src.close();
		desc.close();
	}
}
