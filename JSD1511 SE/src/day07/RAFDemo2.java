package day07;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字节
 * @author Administrator
 *
 */
public class RAFDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("demo.dat","r");
		/*
		 * int read()
		 * 该方法会读取一个字节，并将该字节转换为
		 * 一个int值保存，该int值只有”低八位“有效
		 * 若该int值表示的数字为-1，则表示读取到文件末尾
		 * 
		 */
		int d=raf.read();
		System.out.println(d);
		raf.close();
	}
}
