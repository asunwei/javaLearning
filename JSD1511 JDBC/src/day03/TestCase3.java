package day03;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.UUID;

import org.junit.Test;

/**
 * 结果集的测试
 * @author Administrator
 *
 */
public class TestCase3 {
//	@Test
	/*
	 * 测试数据库的结果集元素
	 */
	public void testDateBaseInfo(){
		//在软件中-----------------------------------
		Connection conn=null;
		try {
			//检查当前数据库的相关信息
			conn=DBUtil.getConnection();
			//JDBC 提供了一个接口，专门检查数据库相关信息
			DatabaseMetaData info=conn.getMetaData();
			//获取数据库的产品名称
			String name=info.getDatabaseProductName();
			//检查版本号    Major:主板本号
			int v=info.getDatabaseMajorVersion();
			//自版本号
			int v2=info.getDatabaseMinorVersion();
			System.out.println(v+"."+v2);
			//还有很多的getXXX方法，返回数据库的元数据相关信息
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
	}
	
//	@Test
	public void testResultSet(){
		/*
		 * 在软件中，检查结果集相关信息的时候，就可以使用结果集
		 * 元素接口
		 * ResultSetMetaData
		 * 包含：结果集的列数，每列的列名等
		 */
		//使用方法：ResultSet作为工厂获得ResultSetMetaData
		String sql="select id as \"id\",name as \"name\",pwd as \"pwd\"," +
				" mobile as \"mobile\" ,balance as \"balance\" from robin_account";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			//得到元素对象
			ResultSetMetaData info=rs.getMetaData();
			//检查结果集有几列
			//Column:列  Count: 统计
			int n=info.getColumnCount();
			System.out.println(n);
			//序号：从1开始，到n
			for(int i=1;i<=n;i++){
				String c=info.getColumnName(i);
				System.out.println(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
	  }
	}
	
//	@Test
	public void testTest(){
		test(1,2,1000);
	}
	/*
	 *测试借款方法 
	 */
	public void test(int from,int to,double money){
		String dml="update robin_account set balance=balance + ? where id= ?";
		String dql="select balance from robin_account where id=?";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			//关不自动提交，目的：开启事务
			conn.setAutoCommit(false);
			//处理事务过程
			//执行扣款过程
			PreparedStatement ps=conn.prepareStatement(dml);
			ps.setDouble(1, -money);
			ps.setInt(2, from);
			int n=ps.executeUpdate();
			//检查扣款结果
			if(n!=1){//扣款不成功
				//拋异常，回滚事务
				throw new SQLException("扣款失败");
			}
			//检查扣款结果
			PreparedStatement ps1=conn.prepareStatement(dql);
			ps1.setInt(1, from);
			ResultSet rs=ps1.executeQuery();
			while(rs.next()){
				double b=rs.getDouble("balance");
				if(b<0){
					//回滚事务，取消扣款
					throw new SQLException("余额不足");
				}
			}
			//向目标账户增加金额
			ps.setDouble(1,money);
			ps.setInt(2, to);
			n=ps.executeUpdate();
			if(n!=1){//目标账户出现问题,回滚
				throw new SQLException("目标账户有问题");
			}
			//事务处理正常结束以后，提交事务到数据库
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			//事务处理期间出现任何异常，回滚到事务起始点
			try {
				if(conn!=null){
					conn.rollback();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}finally{
			DBUtil.close(conn);
		}
	}
	
	/*
	 * 批量执行SQL
	 */
//	@Test
	public void testBatchDDL(){
		String sql1="create table emp_a (empno number(6),ename varchar(100))";
		String sql2="create sequence seq_emp";//
		//
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			//添加SQl语句批量处理缓存区
			st.addBatch(sql1);
			st.addBatch(sql2);
			//添加更多SQL
			//批量执行SQL 返回数据，每个SQL一个数字结果
			//返回结果：
			int[] arr=st.executeBatch();
			System.out.println(Arrays.toString(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
	}
	
//	@Test
	/*
	 * 
	 */
	public void testUUID(){
		String uuid =UUID.randomUUID().toString();
		System.out.println(uuid);
	}
	

}

