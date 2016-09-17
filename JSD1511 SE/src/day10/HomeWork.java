package day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 * @author Administrator
 *
 */
public class HomeWork {
	public static void main(String[] args) {
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			br=new BufferedReader(new InputStreamReader(
					new FileInputStream("pw.txt")
					)
			);
			//读取每一个字符串
			String line=null;
			//拼接后的字符串
			String message="";
			while((line=br.readLine())!=null){
				message+=line;
			}
			//写到文件中
			pw=new PrintWriter(new FileOutputStream("pw.txt",true));
			pw.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){
					br.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(br!=null){
				pw.close();
			}
		}
		System.out.println("完成！");
	}
}
