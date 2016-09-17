package day09;

import java.io.PrintWriter;

/**
 * java .io.PrintWriter
 * 具有自动刷新的缓冲字符输出流，由于内建BufferedWriter,
 * 所以其具备缓冲功能
 * @author Administrator
 *
 */
public class PWDemo1 {
	public static void main(String[] args)throws Exception {
		/*
		 * PrintWriter提供了直接操作文件的
		 * 构造方法
		 * PrintWruter(File file)
		 * PrintWriter(String fileName)
		 */
		PrintWriter pw=new PrintWriter("pw.txt");
		//调用该方法可以自动写出换行
		pw.println("我爱北京天安门");
		pw.println("天安门上太阳升");
		
		System.out.println("写出完毕！");
		pw.close();
	}
}
