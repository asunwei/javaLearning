package day08;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Demo06 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("test.dat");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int i=0;
		/*while(i>9000){
			bos.write(66);
			i++;
		}*/
		bos.write(66);
		bos.write(65);
		/*
		 * flush会清空缓存区，将缓存区数据可靠写到底层字流中
		 * 不关闭文件！flush方法以后可以继续向文件写数据
		 */
		bos.flush();
		bos.write(66);
		
		/*
		 * 会清空缓冲区，将缓存区数据可靠写到
		 * 底层字节流中，并且关闭文件
		 * 如果不关闭文件，缓存区中的数据可能被丢弃
		 */
		/*bos.close();*/
		System.out.println("完成");
	}
}
