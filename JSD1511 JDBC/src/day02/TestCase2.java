package day02;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

public class TestCase2 {
//	@Test
	//测试数据库工具类
	public void testDBUtil(){
		String sql="select 1 as a from dual";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			/*
			 * 关闭资源释放问题：建议资源使用以后立即释放
			 * 关闭连接的时候，会全部释放资源
			 */
			rs.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
	}
	
	
	/*
	 * 文件读取
	 * 1：从文件系统中读取资源（图片，xml）
	 *    从文件保存的操作系统的一个位置
	 *   从文件系统读取文件
	 *   String filePath="d:/home/soft/demo.png";
	 *   InputStream in=new FileInputStream(filePath);
	 
	 * 2：从包(paketage)中读取资源（包，xml）
	 *   固定的写法
	 *   包路径/资源文件名(不需要项目名)
	 *   String file="day02/db.properties";
	 *   如下语法：Java提供的专门用于从包中读取资源API方法
	 *   InputStream in=TestCase.class.getClassLoader.getResourceAsStream(file);
	 */
//	@Test
	/*
	 * 测试配置文件读取
	 */
	public void testProperties() throws IOException{
		String file="day02/db.properties";
		//java.util包中的类
		Properties cfg=new Properties();
		//从包（package）中读取资源,固定格式
		InputStream in=TestCase2.class.getClassLoader().getResourceAsStream(file);
		/*
		 * 从流中读取配置信息中到散列表中
		 */
		cfg.load(in);
		System.out.println(cfg);
	}
	
//	@Test
	/*
	 * 测试数据库连接池
	 */
	public void testConnectionPool(){
		
		BasicDataSource ds= new BasicDataSource();
		/*
		 *设置数据库连接参数（必须参数）
		 */
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("123456");
		/*
		 * 可选的 连接池管理策略参数
		 */
		//Initial 初始size大小 初始连接数量
		ds.setInitialSize(2);
		//Max最大的Idle 空闲，设置空闲连接数量
		ds.setMaxIdle(2);
		//Active 活动的 设置活动数量
		ds.setMaxActive(50);
		/*
		 * 从连接池中获得连接
		 * ds.getConnection()
		 * 连接池会尽量重用连接，返回连接对象
		 * 如果连接池的数量满了，会等到连接归还以后返回重用的连接
		 * 连接使用后，务必调用close（）方法
		 * 归还连接到连接池
		 */
		Connection conn=null;
		try {
			conn=ds.getConnection();
			String sql="select 'Hello' as a from dual";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	
//	@Test
	/*
	 * 测试利用带参数的SQL语句，执行插入操作
	 */
	public void testInsert(){
		//带参数的SQL语句
		String sql="insert into robin_dept (deptno,dname) values (?,?)";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			/*
			 * 将SQL发送到数据库，建立对应的执行计划
			 */
			PreparedStatement ps=conn.prepareStatement(sql);
			/*
			 * 替换执行计划参数，必须全部计划
			 */
			ps.setInt(1, 50);
			ps.setString(2, "PHP");
			/*
			 * 执行替换参数以后的执行计划
			 */
			int n=ps.executeUpdate();
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
		
	}
//	@Test
	/*
	 * 建立Account 账户表
	 */
	public void testCreateAccount(){
		String sql="create table robin_account(id number(6)," +
				                        "name varchar2(50)," +
				                        "pwd varchar2(50)," +
				                        "mobile varchar2(80)," +
				                        "balance number(8,2))";
		//执行SQl
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			boolean b=st.execute(sql);
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	@Test
	/*
	 * 测试增删改
	 */
	public void testSave(){
		Account a=new Account(1,"tom","123","110",123.00);
		save(a);
		System.out.println(a);
		Account x=findById(1);
		System.out.println(x);
		x.setName("JERRY");
		update(x);
		Account y=findById(1);
		System.out.println(y);
//		delete(1);
		Account z=findById(1);
		System.out.println(z);
	}
	/*
	 * 将帐号对象的信息保存到数据库中
	 */
	public void save(Account a){
		String sql="insert into robin_account (id,name,pwd,mobile,balance) values (?,?,?,?,?)";
		//使用ps执行带参数的SQL
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			//替换参数ps.
			ps.setInt(1, a.getId());
			ps.setString(2, a.getName());
			ps.setString(3, a.getPwd());
			ps.setString(4, a.getMobile());
			ps.setDouble(5, a.getBalance());
			int n=ps.executeUpdate();
			System.out.println(n);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
	}
	
	public Account findById(int id){
		String sql="select id,name,pwd,mobile,balance from robin_account" +
				               " where id=?";
		//使用ps执行带参数的SQL
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			//DQL 语句使用无参数的ps.executeQuery()
			ResultSet rs=ps.executeQuery();
			Account a=null;
			while(rs.next()){
				//替换参数
				a=new Account();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setPwd(rs.getString("pwd"));
				a.setMobile(rs.getString("mobile"));
				a.setBalance(rs.getDouble("balance"));
			}
			return a;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
		return null;
	}
	
	/*
	 * 将内存中的Accunt的数据更新的数据库中
	 * 更新ID一样的Account信息
	 */
	public void update(Account a){
		String sql="update robin_account set name=?,pwd=?,mobile=?,balance=? where id=?";
		//执行SQL语句
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(5, a.getId());
			ps.setString(1, a.getName());
			ps.setString(2, a.getPwd());
			ps.setString(3,a.getMobile());
			ps.setDouble(4, a.getBalance());
			int n = ps.executeUpdate();
			System.out.println("修改了"+n+"行");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	
	public void delete(int id){
		String sql="delete from robin_account where id=?";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			//替换参数并执行
			int n=ps.executeUpdate();
			System.out.println("删除了"+n+"行");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
	}

//	@Test
	/*
	 * 创建dept_swei部门表
	 */
	public void testDept(){
		String sql="create table dept_swei1(deptno number(2,0),dname varchar2(14), loc varchar2(13))";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			boolean b=st.execute(sql);
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	@Test 
	/**
	 * 插入数据
	 */
	public void testInsert2(){
		String sql="insert into dept_sw (deptno,dname,loc) values (?,?,?)";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setDouble(1, 10);
			ps.setString(2, "ACCOUNTING");
			ps.setString(3, "NEW YORK");
			int n = ps.executeUpdate();
			System.out.println("插入了"+n+"行");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
//	@Test
	/*
	 * 查询部门信息
	 */
	public void findDept(){
		String sql="select deptno,dname,loc from dept_sw where deptno=?";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setDouble(1, 10);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int n=rs.getInt("deptno");
				String dname=rs.getString("dname");
				String loc=rs.getString("loc");
				System.out.println(n+","+dname+","+loc);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
	}
}
