package day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo03 {
	public static void main(String[] args)throws Exception {
		String src="D:/music.mp3";
		String dsc="D:/music_copy.mp3";
		//��Դ�ļ��������Ƶ��ļ�
		FileInputStream in=new FileInputStream(src);
		//��Ŀ���ļ����������ļ�
		FileOutputStream out=new FileOutputStream(dsc);
		int b;
		while((b=in.read())!=-1){
			out.write(b);//��in��ȡÿ��byteд��outȥ
		}
		in.close();
		out.close();
		System.out.println("���Ƴɹ�");
	}
}
