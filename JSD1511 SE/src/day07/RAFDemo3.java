package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *RandomAccessFile读写基本类型数据
 * 以及基于指针的读写操作原理
 * @author Administrator
 *
 */
public class RAFDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("test.dat","rw");
		long pos=raf.getFilePointer();
		System.out.println("pos:"+pos);
		//向文件中写入int最大值
		int max=Integer.MAX_VALUE;
		/*
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 */
		raf.write(max>>>24);		
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * void seek(long pos)
		 * 移动指针到指定位置
		 * 
		 */
		raf.seek(0);
		System.out.println("seek到0");
		int i=raf.readInt();
		System.out.println(i);
		System.out.println("pos:"+raf.getFilePointer());
		//读double
		raf.seek(16);
		double d=raf.readDouble();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		raf.close();
		
		
		
	}
}
