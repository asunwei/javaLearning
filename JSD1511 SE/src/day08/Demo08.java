package day08;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo08 {
	public static void main(String[] args)throws Exception {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("obj.dat"));
		/*
		 * 从流中读取对象
		 */
		Bird b1=(Bird) ois.readObject();
		System.out.println(b1);
		ois.close();
	}
}
