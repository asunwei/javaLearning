package day01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo01 {
	public static void main(String[] args)throws Exception{
		
			/*
			 * 使用JDBC
			 * 1.加载驱动
			 * 利用Class.forName方法将Oracle的JDBC
			 * 驱动加载到内存中
			 */
			Class.forName("oracle.jdbc.OracleDriver");
			/*
			 * 2.建立连接
			 * Connection 接口，来自java.sql
			 * 实现类来自Oracle驱动
			 * 利用DriverManager作为工厂创建Connection 接口实例（对象）
			 * 利用DriverManager创建Connection
			 */
			String url="jdbc:oracle:thin:@localhost:1521:xe";//IP地址
			String user="system";
			String pwd="123456";
			//getConnection 方法需要3个参数，用于找到并登录一个Oracle服务器
			Connection conn=DriverManager.getConnection(url,user,pwd);
			//一旦获得了conn对象，就意味着数据库连接成功
			//conn是一个Connection引用,实际上引用的对象类型来自Oracle驱动包
			//检查对象的类型
			System.out.println(conn.getClass().getName());
			//务必关闭连接
			conn.close();
		
	}
}
