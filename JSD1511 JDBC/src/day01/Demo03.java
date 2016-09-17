package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			conn=DriverManager.getConnection(url,user,pwd);
			Statement st=conn.createStatement();
			String dml="insert into robin_dept(deptno,dname) values (1,'TOM')";
			int n=st.executeUpdate(dml);
			System.out.println("插入："+n+"行");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//在finally中关闭连接的好处；数据库的连接最可靠的关闭
			//防止出现空指针异常
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
