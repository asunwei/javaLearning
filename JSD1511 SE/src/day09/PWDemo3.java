package day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 实现简易的记事本功能
 * 从控制台输入的每句话，都可以保存到
 * 一个文本文件中。“note.txt”
 * 
 */
public class PWDemo3 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scan=new Scanner(System.in);
		FileOutputStream fos=new FileOutputStream("note.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		PrintWriter pw=new PrintWriter(osw,true);
		System.out.println("请输入要保存的内容：");
		String line=null;
		while(true){
			line=scan.nextLine();
			if("exit".equals(line)){
				System.out.println("再见！");
				break;
			}
			pw.println(line);
		}
		pw.close();
	}
}
