package day06;

import java.io.File;

/**
 * java.util.FIle
 * 该类用于表示磁盘上的一个文件或目录
 * 使用File可以：
 * 1：访问文件或目录的属性信息
 * 2：操作文件或目录(创建，删除）
 * 3：查看文件子目录
 * @author Administrator
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		File file=new File("."+File.separator+"text.txt");
		//获取文件名
		String name=file.getName();
		System.out.println("name"+name);
		//文件的大小（字节）
		long length=file.length();
		System.out.println("length："+length+"字节");
		//最后修改时间
		long lm=file.lastModified();
		boolean cr=file.canRead();
		boolean cw=file.canWrite();
		System.out.println(lm);
		System.out.println(cr);
		System.out.println(cw);
		boolean ih = file.isHidden();
		System.out.println(ih);
	}
}
