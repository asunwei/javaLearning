package day01;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 连接数据库
 * 执行DDL创建表
 * @author Administrator
 *
 */
/*
 * JDBC 步骤
 * 1：注册驱动成功（加载驱动）目的：加载JDBC的实现类型
 * 2：连接数据，创建Connection对象，目的是连接java
 *    程序和数据库直接通讯渠道
 * 3：创建Statement（语句）对象，底层就是流，向服务器发送SQL
 * 4：执行SQL，是利用Statement对象的方法将SQL发送到数据库
 *    并且有数据库执行
 * 5：处理SQL执行的结果，boolean in ResultSet
 * 6：关闭连接conn.close(),关闭TCP
 */
public class Demo02 {
	public static void main(String[] args) throws Exception{
		//1 加载驱动
		Class.forName("oracle.jdbc.OracleDriver");
		//2 建立连接
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pwd="123456";
		Connection conn=DriverManager.getConnection(url,user,pwd);
		//3 创建Statement
		Statement st=conn.createStatement();
		//4 执行DDL
		String ddl="create table robin_dept("+"deptno number(6),"+"dname varchar2(50))";
		//利用execute方法发DDL，在数据库上执行
		boolean b = st.execute(ddl);
		//返回值false，表示没有结果集
		//5 处理查询结果
		System.out.println(b);//false
		System.out.println(st.getClass().getName());
		//6 关闭连接
		conn.close();
	}
}
