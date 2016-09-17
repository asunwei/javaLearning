package day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo03 {
	public static void main(String[] args)throws Exception {
		String src="D:/music.mp3";
		String dsc="D:/music_copy.mp3";
		//打开源文件，被复制的文件
		FileInputStream in=new FileInputStream(src);
		//打开目标文件，就是新文件
		FileOutputStream out=new FileOutputStream(dsc);
		int b;
		while((b=in.read())!=-1){
			out.write(b);//从in读取每个byte写到out去
		}
		in.close();
		out.close();
		System.out.println("复制成功");
	}
}
