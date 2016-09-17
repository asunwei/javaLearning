package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		/*
		 * new FOS() 按照写的方式打开文件
		 * 如果文件不存在，就自动创建文件，如果没有
		 * 权限创建文件，就自动抛出异常（失败）
		 * 如果文件已经存在，这个文件将被删除替换掉
		 */
		FileOutputStream out=new FileOutputStream("demo.dat");
		/*
		 * 将参数int作为byte写到文件中，也就是
		 * int中32位数据，只有低8位（byte）写到文件
		 * 中，高24位舍弃
		 */
		out.write(65);
		out.write(66);
		/*
		 * 将byte'数组中的数据成批
		 * 一起写到文件中
		 */
		byte[] buf={65,66};
		byte[] buf1={67,68,69,70};
		out.write(buf);
		out.write(buf1);
		/*
		 * 文件必须关闭！
		 */
		out.close();
		
	}
}
