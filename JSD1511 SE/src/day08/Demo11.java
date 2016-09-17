package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * 字符流读操作
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
		 * read会从底层的byte读取byte数据，在经过
		 * 解码处理，转换为char数据返回，如果
		 * 返回-1表示到文件末尾
		 */
		while((c=isr.read())!=-1){
			char ch=(char) c;
			System.out.print(ch);
		}
		isr.close();
	}
}
