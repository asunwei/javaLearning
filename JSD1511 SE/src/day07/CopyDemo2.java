package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 基于缓存的文件复制
 * 若想提高读写效率，必须减少读写次数，
 * 那么可以通过提高每次读写的数据量达到目的
 * @author Administrator
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src=new RandomAccessFile("music.mp3","r");
		RandomAccessFile desc=new RandomAccessFile("music_copy2.mp3","rw");
		/*
		 * int read(byte[] d)
		 * 一次性读取给定的字节数组长度的字节量
		 * 并存入给定的数组中，而返回值为实际读取
		 * 到得字节量
		 * 若读取到了文件末尾则返回-1
		 */
		int len=-1;
		byte[] buf=new byte[1024*10];
		long start=System.currentTimeMillis();
		while((len=src.read(buf))!=-1){
			/*
			 * void write(byte[] d)
			 * 一次性将给定的字节数组中所有字节写出去
			 * void write（byte[] d,int offset,int len )
			 * 将给定的数组中offerset指定的位置处开始的
			 * len个字节写出
			 * 
			 */
			desc.write(buf, 0, len);
		}
		long end=System.currentTimeMillis();
		System.out.println("复制完毕！耗时："+(end-start)+"毫秒");
		src.close();
		desc.close();
	}
	
}