package day04;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import day03.DBUtil;
public class TestCase4 {
//	@Test
	public void testBatch(){
		/*
		 * 向数据库批量插入数据
		 */
		String sql="insert into emp (empno,ename) values (?,?)";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			int n=675;
			for(int i=0;i<n;i++){
				String name=UUID.randomUUID().toString();
				ps.setInt(1, i);
				ps.setString(2, name);
				//addBatch将参数添加到ps缓冲区
				ps.addBatch();
				if(i%100==0){
					//每100条数据发送一次
					ps.executeBatch();
				}
			}
			ps.executeBatch();
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
	}
//	@Test
	/*
	 * 复习数组
	 */
	public void testArray(){
		int [] ary= new int[4];
		//只能用在声明变量同时初始化
		int[] ary2={2,3,4};
		int[] ary3=new int[]{2,3,4};
		
		int[] ary4;
//		ary4={2,3,4};//编译错误，不能单独初始化,这种格式
		ary4=new int[]{2,3,4};
		
		//引用型数组
		String[]  a1= new String[6];
		String[]  a2={"tom","jerry"};
		String[]  a3=new String[]{"tom","jerry"};
		
		String[] a4;
//		a4={"tom","jerry"};//编译错误
		a4=new String[]{"tom","jerry"};
		
		testStringAry(new String[]{"tom","jerry"});
	}
	public void testStringAry(String[] a){
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
//	@Test
	/*
	 * 获取自动生成的序号
	 * 
	 * 使用场合：
	 * 凡是插入数据，立即获取ID的场合都要使用
	 * 如 注册
	 *     1：在用户表插入一行
	 *     insert into user
	 *     (id,name,pwd) values (seq_user.nextval,?,?)
	 *     获取生成的userId
	 *     2：在账户表中，给新账户增加80元
	 *     insert into account
	 *     (id,user_id,money) values (seq_acc.nextval,userId,80)
	 */
	public void testGenKeys(){
		String sql="insert into emp (empno,ename) values (seq_emp.nextval,?)";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql,new String[]{"empno"});
			ps.setString(1, "TOM");
			ps.executeUpdate();
			/*
			 * 获取自动生成的主键
			 * getGeneratedKeys 与创建ps时候的参数new String[]{"empno"}
			 * 配合使用，返回值就是生成的列
			 */
			ResultSet rs=ps.getGeneratedKeys();
			int empno=-1;
			while(rs.next()){
				//获取生成的列，使用列号获取
				empno=rs.getInt(1);
			}
			System.out.println(empno);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
	}
	
//	@Test
	/*
	 * 使用Dao 非常简洁，调用方法即可
	 * dao 将JDBC操作封装了
	 */
	public void test(){
		Emp e=new Emp(2,"Jerry");
		EmpDao dao=new EmpDaoOracleImpl();
//		dao.add(e);
//		dao.delete(e);
		List<Emp> all=dao.findAll();
		/*
		 * 利用员工号排序
		 */
		Collections.sort(all,new Comparator<Emp>(){
			public int compare(Emp o1,Emp o2){
				//按照empno大小比较
				return o1.getEmpno()-o2.getEmpno();
			}
		});
		for(Emp e1:all){
			System.out.println(e1);
		}
		Emp e2=dao.fingById(3);
		System.out.println(e2);
		Emp e3=new Emp(1,"JERRY");
		dao.update(e3);
		
	}
	@Test
	/*
	 * 批量插入总结
	 */
	public void testBatch2(){
		String sql="insert into emp (empno,ename) values (?,?)";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setString(2, "jeck");
			ps.addBatch();
			ps.setInt(1, 2);
			ps.setString(2, "rose");
//			int n=675;
//			for(int i=1;i<=n;i++){
//				String name=UUID.randomUUID().toString();
//				ps.setInt(1, i);
//				ps.setString(2,name);
//				ps.addBatch();
//				if(i%100==0){
//					ps.executeBatch();
//				}
//			}
			ps.addBatch();
			ps.executeBatch();
			System.out.println("ok");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}

//  @Test
  /*
   * 自动插入主键
   */
  public void testGenKeys1(){
	  String sql="Insert into emp (empno,ename) values (seq_emp.nextval,?)";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql, new String[] {"empno"} );
			ps.setString(1,"tom");
			ps.executeUpdate();
			/*
			 * 获取自动生成的主键
			 * getGeneratedKeys 与创建ps时候的参数new String[]{"empno"}
			 * 配合使用，返回值就是生成的列
			 */
			ResultSet rs=ps.getGeneratedKeys();
			int empno=-1;
			while(rs.next()){
				empno=rs.getInt(1);
			}
			System.out.println(empno);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
	}
  }
}
