package day08;

import java.io.FileInputStream;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		/*
		 * new FIS() 文件按照只读方式打开
		 * 如果文件存在，打开文件，文件指针在0位置
		 * 如果文件不存在，就抛出异常
		 * 如果文件不可以读取，也抛出异常
		 */
		FileInputStream in=new FileInputStream("demo.dat");
		/*
		 * int b=in.read(）
		 * 从文件当前位置读取一个byte
		 * 当遇到文件末尾的时候，返回-1作为结束标识
		 */
		int b;
		while((b=in.read())!=-1){
			//b是文件中每个byte
			System.out.print(b+" ");
		}
		in.close();
	}
}
