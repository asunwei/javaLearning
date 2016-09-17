package day09;

import java.sql.SQLException;


/**
 * 重写父类方法
 * @author Administrator
 *
 */
public class Son extends Father{
	/*
	 * 可以不再声明抛出异常
	 */
//	public void dosome(){
//		
//	}
	/*
	 * 可以仅抛出父类抛出的部分异常
	 */
//	public void dosome() throws IOException{
//		
//	}
	/*
	 * 可以抛出父类抛出异常的子类异常
	 */
//	public void dosome() throws FileNotFoundException{
//		
//	}
	/*
	 * 不可以抛出与父类抛出异常没有任何继承
	 * 关系的其他异常
	 */
//	public void dosome() throws SQLException{
//		
//	}
	/*
	 * 不可以抛出父类抛出异常的父类异常
	 */
//	public void dosome() throws Exception{
//		
//	}
}
