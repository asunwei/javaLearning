package day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo05 {
	public static void main(String[] args)throws Exception {
		String src="D:/music.mp3";
		String dsc="D:/music_copy.mp3";
		//��Դ�ļ�
		/*
		 * ���ļ���Ϊ������
		 */
		FileInputStream fis=new FileInputStream(src);
		/*
		 * Ϊ�������Ļ�����
		 * �����߼�����ı䣬����ʹ�û�����
		 * �Ϳ�������
		 */
		BufferedInputStream in=new BufferedInputStream(fis);
		/*
		 * �򿪻��������
		 */
		FileOutputStream fos=new FileOutputStream(dsc);
		/*
		 * �ڻ���������Ļ�������չ���������
		 */
		BufferedOutputStream out=new BufferedOutputStream(fos);
		long start=System.currentTimeMillis();
		int b;
		while((b=in.read())!=-1){
			out.write(b);//��in��ȡÿ��byteд��outȥ
		}
		long end=System.currentTimeMillis();
		in.close();
		out.close();
		System.out.println("���Ƴɹ�!��ʱ��"+(end-start)+"����");
	}
}