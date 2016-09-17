package day01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
/**
 * Test 测试
 * Case 案例
 * @author Administrator
 *
 */
public class TestCase1 {
	/*
	 * Java5 以后的语法，
	 * 在无返回值的，无参数的共有方法之使用
	 * @Test就可以使用junit测试执行这个方法
	 */
//	@Test
	public void hello(){
		System.out.println("Hello World!");
	}
	
//	@Test
	public void helloKitty(){
		System.out.println("Hello Kitty!");
	}
	
	/*
	 * 向表中插入数据
	 */
	//@Test
	public void testInsert(){
		String sql = "insert into robin_dept (deptno,dname) values (2,'ROSE')";
		Connection cnn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			cnn=DriverManager.getConnection(url,user,pwd);
			Statement st=cnn.createStatement();
			int n=st.executeUpdate(sql);
			System.out.println("插入了"+n+"行");
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
	/*
	 * 在表中更新数据
	 */
//	@Test
	public void testUpdate(){
		String sql="update robin_dept set dname='JERRY' where deptno=1";
		Connection cnn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			cnn=DriverManager.getConnection(url,user,pwd);
			Statement st=cnn.createStatement();
			int n=st.executeUpdate(sql);
			System.out.println("更新了"+n+"行");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(cnn!=null){
				try {
					cnn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * 查询语句
	 */
	@Test
	public void testSelect(){
		String sql="select deptno,dname from robin_dept where deptno=1";
	    Connection cnn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			cnn=DriverManager.getConnection(url,user,pwd);
			Statement st=cnn.createStatement();
			/*
			 * 执行DQL语句，使用st.executeQuery(dql);
			 * 方法。返回ResultSet对象
			 */
			ResultSet rs=st.executeQuery(sql);
			//处理ResultSet对象
			while(rs.next()){
				int n=rs.getInt("deptno");
				int n1=rs.getInt(1);//少用，不常用
				String str=rs.getString("dname");
				String str1=rs.getString(2);//少用，不常用
				System.out.println(n+","+str);
			}
			System.out.println(rs.getClass().getName());
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
	
	/*
	 * 测试保存对象的方法
	 */
//	@Test
	public void TestSave(){
		Dept d=new Dept(5,"JAVA");
		//执行以后部门对象保存到数据库中
		save(d);
		System.out.println("保存完成！");
	}
	/*
	 * 封装对象保存过程
	 */
	public void save(Dept dept){
		System.out.println(dept.getDeptno()+3);
		System.out.println(dept.getDname());
		/*
		 * SQL 语句在拼接的时候要注''(分号)的
		 * 拼接处理，避免语法错误
		 */
		//dept deptno=5 dname="Java" 
		String sql="insert into robin_dept (deptno,dname) values("+dept.getDeptno()+",'"+dept.getDname()+"')";
		//执行DML语句
		Connection cnn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			cnn=DriverManager.getConnection(url,user,pwd);
			Statement st=cnn.createStatement();
			int n=st.executeUpdate(sql);
			System.out.println("插入了"+n+"行");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(cnn!=null){
				try {
					cnn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 * 测试对象连接操作
	 */
//	@Test
	public void testFindById(){
		//根据对象的ID从数据库中找打对象
		Dept d=findById(5);
		System.out.println(d);
	}
	/*
	 * 对象找回操作
	 * 根据部门在数据中找回部门对象
	 */
	public Dept findById(int deptno){
		String sql="select deptno ,dname from robin_dept where deptno=deptno";
		Connection cnn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			cnn=DriverManager.getConnection(url,user,pwd);
			Statement st=cnn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			//查询结果rs
			//程序的返回值 Dept 部门对象
			//将rs中的数据读取到部门对象
			// dept 赋值为null的目的是：在没有
            // 查询结果的情况下直接返回null
            // 用于表示查询结果为”空“！
			Dept dept=null;
			while(rs.next()){
				//处理当前行的数据
				int n=rs.getInt("deptno");
				String name=rs.getString("dname");
				dept=new Dept();
				dept.setDeptno(n);
				dept.setDname(name);
			}
			//返回null表示没有这个部门
			return dept;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(cnn!=null){
				try {
					cnn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
