package day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ʵ�ּ��׵ļ��±�����
 * �ӿ���̨�����ÿ�仰�������Ա��浽
 * һ���ı��ļ��С���note.txt��
 * 
 */
public class PWDemo3 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scan=new Scanner(System.in);
		FileOutputStream fos=new FileOutputStream("note.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		PrintWriter pw=new PrintWriter(osw,true);
		System.out.println("������Ҫ��������ݣ�");
		String line=null;
		while(true){
			line=scan.nextLine();
			if("exit".equals(line)){
				System.out.println("�ټ���");
				break;
			}
			pw.println(line);
		}
		pw.close();
	}
}
