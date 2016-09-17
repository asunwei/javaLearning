package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 删除数据中的一行数据
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		String sql="delete from robin_dept where deptno=1";
		Connection cnn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			cnn=DriverManager.getConnection(url,user,pwd);
			Statement st=cnn.createStatement();
			int n=st.executeUpdate(sql);
			System.out.println("删除了"+n+"行");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(cnn!=null){
				try {
					cnn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
