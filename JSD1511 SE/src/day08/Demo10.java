package day08;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 字符流写文件
 * @author Administrator
 *
 */
public class Demo10 {
	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("demo.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		/*
		 * write会自动将英文'A'编码为1个byte数据写到
		 * 底层的文件流
		 */
		osw.write('A');
		/*
		 * write 会自动将英文‘中’编码为三个字节写到底层
		 * 的文件流
		 */
		osw.write('国');
		osw.write("达内科技");
		osw.close();
		System.out.println("完毕！");
	}
}
