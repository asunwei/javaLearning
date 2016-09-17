package day08;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo07 {
	public static void main(String[] args)throws Exception {
		Bird b1=new Bird();
		FileOutputStream fos=new FileOutputStream("obj.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//使用高级流提供的方法
		/*
		 * writeObject 自动将对象b1转换为一系列
		 * byte数据写到底层的byte流中
		 * writeObject 方法会自动调用Java编译器在类型上插入的对象IO方法
		 * 
		 * 对象流输出在基本输出流的基础上扩展对象
		 * 输出流功能
		 */
		oos.writeObject(b1);
		oos.close();
	}
}
