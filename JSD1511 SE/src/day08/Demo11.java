package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * �ַ���������
 * @author Administrator
 * @since
 *
 */
public class Demo11 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("demo.txt");
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		int c;
		/*
		 * read��ӵײ��byte��ȡbyte���ݣ��ھ���
		 * ���봦��ת��Ϊchar���ݷ��أ����
		 * ����-1��ʾ���ļ�ĩβ
		 */
		while((c=isr.read())!=-1){
			char ch=(char) c;
			System.out.print(ch);
		}
		isr.close();
	}
}
