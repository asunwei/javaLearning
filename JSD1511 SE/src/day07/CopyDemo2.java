package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ڻ�����ļ�����
 * ������߶�дЧ�ʣ�������ٶ�д������
 * ��ô����ͨ�����ÿ�ζ�д���������ﵽĿ��
 * @author Administrator
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src=new RandomAccessFile("music.mp3","r");
		RandomAccessFile desc=new RandomAccessFile("music_copy2.mp3","rw");
		/*
		 * int read(byte[] d)
		 * һ���Զ�ȡ�������ֽ����鳤�ȵ��ֽ���
		 * ����������������У�������ֵΪʵ�ʶ�ȡ
		 * �����ֽ���
		 * ����ȡ�����ļ�ĩβ�򷵻�-1
		 */
		int len=-1;
		byte[] buf=new byte[1024*10];
		long start=System.currentTimeMillis();
		while((len=src.read(buf))!=-1){
			/*
			 * void write(byte[] d)
			 * һ���Խ��������ֽ������������ֽ�д��ȥ
			 * void write��byte[] d,int offset,int len )
			 * ��������������offersetָ����λ�ô���ʼ��
			 * len���ֽ�д��
			 * 
			 */
			desc.write(buf, 0, len);
		}
		long end=System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"����");
		src.close();
		desc.close();
	}
	
}