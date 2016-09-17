package day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;





/**
 * 
 * @author Administrator
 *
 */
public class AcounntDemo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("欢迎登录！");
		String nameRule="^\\w{3,8}$";
		String pwdRule="^[0-9]{3,6}$";
		String name=null;
		while(true){
			if(name==null){
				System.out.println("请输入用户名:");
				name =in.nextLine();
				if(!name.matches(nameRule)){
					System.out.println("必须是3到8个字符！");
					name=null;
					continue;
				}
			}
			System.out.println("请输入密码：");
			String pwd=in.nextLine();
			if(!pwd.matches(pwdRule)){
				System.out.println("必须是3到6个数字！");
				continue;
			}
			//得到正确的用户名和密码
			boolean success=login2(name,pwd);
			if(success){//成功
				System.out.println("您好！"+name);
				break;
			} else{
				System.out.println("用户名或者密码错误！");
				name=null;
			}
		}
	}
	public static boolean login2(String name,String pwd){
		String sql="select count(*) from robin_account where name=?,pwd=?";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "Tom");
			ps.setString(2, "123");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int n=rs.getInt(1);
				if(n>=1){
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally{
			DBUtil.close(conn);
		}
		return false;
	}
/*	public static boolean login(String name,String pwd){
		//name=pwd  pwd=123
		String sql="select count(*) from robin_account " +
				"where name='" +name+"'and pwd='"+pwd+"'";
		
		 * select counnt(*) from robin_account where name='Tom' and pwd='123'
		 * 如果用户存在返回>=1,返回0 不存在
		 * 
		 
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				int n=rs.getInt(1);
				if(n>=1){
					return true;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally{
			DBUtil.close(conn);
		}
		return false;
		
	}*/
}