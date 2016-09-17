package day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * 创建一个具有自动行刷新的缓冲字符流
 * 构造方法第一个参数必须是流
 * @author Administrator
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos=new FileOutputStream("pw1.txt");
		/*
		 * 当第一个参数为流时，可以支持一个boolean
		 * 类型的第二个参数，当值为ture时，那么就具有
		 * 自动行刷新功能
		 */
		PrintWriter pw=new PrintWriter(fos,true);
		/*
		 * 每当使用println方法写出字符串的时候，就回自动flush
		 * 注意调用print方法不会自动行刷新
		 */
		pw.println("夜空中最闪亮的星");
		pw.println("能否听清");
		System.out.println("写出完毕！");
		pw.close();
	}
}
