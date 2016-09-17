package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流
 * 特点：以行为单位读取字符串
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
		 * 连续读取若干的字符，直到读取到换行符为止
		 * 然后将之前的所有字符组成一个字符串返回，
		 * 需要注意的是，该字符串不包含最后的换行符
		 * 如果返回的字符串是NULL，则说明EOF
		 * 
		 */
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		
	}
}
