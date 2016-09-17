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
			System.out.println("���룺"+n+"��");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//��finally�йر����ӵĺô������ݿ��������ɿ��Ĺر�
			//��ֹ���ֿ�ָ���쳣
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
