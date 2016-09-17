package day01;

import java.util.Scanner;

public class StringDemo17 {

	public static void main(String[] args) {
		/*
		 * startsWith检测字符串以那些字符为开头的
		 * 检测用户输入的命令是什么
		 */
		Scanner in = new Scanner(System.in);
		//in.nextLine()从控制台读取一行字符串
		String cmd = in.nextLine();
		//检测cmd 字符串是否是 以 cp为开头的命令
		if(cmd.startsWith("cp ")){
			System.out.println(
					"这是一个复制命令");
		}else{
			System.out.println("不认得"); 
		}
	}

}




