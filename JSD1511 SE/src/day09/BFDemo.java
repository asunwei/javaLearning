package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * �����ַ�������
 * �ص㣺����Ϊ��λ��ȡ�ַ���
 * @author Administrator
 *
 */
public class BFDemo {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream(
				"D:"+File.separator+
				"JAVARUN"+File.separator+
				"JSD1511 SE"+File.separator+
				"src"+File.separator+
				"day09"+File.separator+"BFDemo.java");
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);
		
		/*
		 * String readLine()
		 * ������ȡ���ɵ��ַ���ֱ����ȡ�����з�Ϊֹ
		 * Ȼ��֮ǰ�������ַ����һ���ַ������أ�
		 * ��Ҫע����ǣ����ַ������������Ļ��з�
		 * ������ص��ַ�����NULL����˵��EOF
		 * 
		 */
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		
	}
}
