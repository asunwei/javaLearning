package day07;
import java.io.File;
public class FileDemo1 {
	/**使用file创建目录
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 在当前根目录下创建一个叫做demo目录
		 */
		File dir=new File("demo");
		if(!dir.exists()){
			//创建目录
			dir.mkdir();
			System.out.println("创建完毕！");
		}
	}

}
