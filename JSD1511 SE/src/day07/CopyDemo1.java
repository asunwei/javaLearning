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
		 * 1:����һ��RAF��ȡԭ�ļ�
		 * 2���ٴ���һ��RAF������Ŀ���ļ���д
		 * 3��ѭ����ԭ�ļ��ж�ȡÿһ���ֽڣ�Ȼ�󽫸��ֽڵ�����
		 * д�뵽Ŀ���ļ��У�ֱ������ԭ�ļ���ĩβ
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
		System.out.println("������ϣ���ʱ:"+(end-star)+"���� ");
		src.close();
		desc.close();
	}
}
