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
			//��ȡÿһ���ַ���
			String line=null;
			//ƴ�Ӻ���ַ���
			String message="";
			while((line=br.readLine())!=null){
				message+=line;
			}
			//д���ļ���
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
		System.out.println("��ɣ�");
	}
}
