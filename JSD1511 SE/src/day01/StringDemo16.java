package day01;

public class StringDemo16 {

	public static void main(String[] args) {
		/*
		 * endsWith 方法用于检测字符串的结尾
		 * 字符情况，如果满足条件返回true,否则
		 * 返回false
		 * 常见用途：检测文件名对应的文件类型
		 */
		String filename = "Java基础.avi";
		if(filename.endsWith(".avi")){
			System.out.println("这是视频文件");
		}
		filename = "Java基础.aVI  ";
		if(filename.trim()
			.toLowerCase().endsWith(".avi")){
			System.out.println("这是视频文件");
		}
		
		
 
		
	}
}








