package day03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		
		String sql="select id from student1 ";
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			conn=DriverManager.getConnection(url,user,pwd);
			Statement ps=conn.createStatement();
//			ps.setInt(1, 10);
			ResultSet rs=ps.executeQuery(sql);
			while(rs.next()){
				int n=rs.getInt("id");
//				String dname=rs.getString("dname");
//				String loc=rs.getString("loc");
				System.out.println(n);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
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
