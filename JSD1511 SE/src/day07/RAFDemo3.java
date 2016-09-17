package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *RandomAccessFile��д������������
 * �Լ�����ָ��Ķ�д����ԭ��
 * @author Administrator
 *
 */
public class RAFDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("test.dat","rw");
		long pos=raf.getFilePointer();
		System.out.println("pos:"+pos);
		//���ļ���д��int���ֵ
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
		 * �ƶ�ָ�뵽ָ��λ��
		 * 
		 */
		raf.seek(0);
		System.out.println("seek��0");
		int i=raf.readInt();
		System.out.println(i);
		System.out.println("pos:"+raf.getFilePointer());
		//��double
		raf.seek(16);
		double d=raf.readDouble();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		raf.close();
		
		
		
	}
}
