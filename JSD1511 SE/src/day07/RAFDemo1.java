package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 该类用于读写文件数据
 * 其读写是基于指针当前位置进行的
 * RAF有两种常用操作模式，分别对应一个字符串：
 * r:只读模式
 * rw：读写模式
 * @author Administrator
 *
 */
public class RAFDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 对项目根目录下的demo.dat文件
		 * 进行读写操作
		 */
		RandomAccessFile raf=new RandomAccessFile("demo.dat","rw");
		int i=1;
		/*
		 * void write(int i)
		 * 向文件中写出一个字节，写出的是给定的
		 * int值对应的二进制中的”低八位“
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(65);
		/*
		 * 关闭释放资源
		 */
		raf.close();
	}
}
