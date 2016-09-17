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
	//�������ݿ⹤����
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
			 * �ر���Դ�ͷ����⣺������Դʹ���Ժ������ͷ�
			 * �ر����ӵ�ʱ�򣬻�ȫ���ͷ���Դ
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
	 * �ļ���ȡ
	 * 1�����ļ�ϵͳ�ж�ȡ��Դ��ͼƬ��xml��
	 *    ���ļ�����Ĳ���ϵͳ��һ��λ��
	 *   ���ļ�ϵͳ��ȡ�ļ�
	 *   String filePath="d:/home/soft/demo.png";
	 *   InputStream in=new FileInputStream(filePath);
	 
	 * 2���Ӱ�(paketage)�ж�ȡ��Դ������xml��
	 *   �̶���д��
	 *   ��·��/��Դ�ļ���(����Ҫ��Ŀ��)
	 *   String file="day02/db.properties";
	 *   �����﷨��Java�ṩ��ר�����ڴӰ��ж�ȡ��ԴAPI����
	 *   InputStream in=TestCase.class.getClassLoader.getResourceAsStream(file);
	 */
//	@Test
	/*
	 * ���������ļ���ȡ
	 */
	public void testProperties() throws IOException{
		String file="day02/db.properties";
		//java.util���е���
		Properties cfg=new Properties();
		//�Ӱ���package���ж�ȡ��Դ,�̶���ʽ
		InputStream in=TestCase2.class.getClassLoader().getResourceAsStream(file);
		/*
		 * �����ж�ȡ������Ϣ�е�ɢ�б���
		 */
		cfg.load(in);
		System.out.println(cfg);
	}
	
//	@Test
	/*
	 * �������ݿ����ӳ�
	 */
	public void testConnectionPool(){
		
		BasicDataSource ds= new BasicDataSource();
		/*
		 *�������ݿ����Ӳ��������������
		 */
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("123456");
		/*
		 * ��ѡ�� ���ӳع�����Բ���
		 */
		//Initial ��ʼsize��С ��ʼ��������
		ds.setInitialSize(2);
		//Max����Idle ���У����ÿ�����������
		ds.setMaxIdle(2);
		//Active ��� ���û����
		ds.setMaxActive(50);
		/*
		 * �����ӳ��л������
		 * ds.getConnection()
		 * ���ӳػᾡ���������ӣ��������Ӷ���
		 * ������ӳص��������ˣ���ȵ����ӹ黹�Ժ󷵻����õ�����
		 * ����ʹ�ú���ص���close��������
		 * �黹���ӵ����ӳ�
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
	 * �������ô�������SQL��䣬ִ�в������
	 */
	public void testInsert(){
		//��������SQL���
		String sql="insert into robin_dept (deptno,dname) values (?,?)";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			/*
			 * ��SQL���͵����ݿ⣬������Ӧ��ִ�мƻ�
			 */
			PreparedStatement ps=conn.prepareStatement(sql);
			/*
			 * �滻ִ�мƻ�����������ȫ���ƻ�
			 */
			ps.setInt(1, 50);
			ps.setString(2, "PHP");
			/*
			 * ִ���滻�����Ժ��ִ�мƻ�
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
	 * ����Account �˻���
	 */
	public void testCreateAccount(){
		String sql="create table robin_account(id number(6)," +
				                        "name varchar2(50)," +
				                        "pwd varchar2(50)," +
				                        "mobile varchar2(80)," +
				                        "balance number(8,2))";
		//ִ��SQl
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
	 * ������ɾ��
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
	 * ���ʺŶ������Ϣ���浽���ݿ���
	 */
	public void save(Account a){
		String sql="insert into robin_account (id,name,pwd,mobile,balance) values (?,?,?,?,?)";
		//ʹ��psִ�д�������SQL
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			//�滻����ps.
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
		//ʹ��psִ�д�������SQL
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			//DQL ���ʹ���޲�����ps.executeQuery()
			ResultSet rs=ps.executeQuery();
			Account a=null;
			while(rs.next()){
				//�滻����
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
	 * ���ڴ��е�Accunt�����ݸ��µ����ݿ���
	 * ����IDһ����Account��Ϣ
	 */
	public void update(Account a){
		String sql="update robin_account set name=?,pwd=?,mobile=?,balance=? where id=?";
		//ִ��SQL���
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
			System.out.println("�޸���"+n+"��");
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
			//�滻������ִ��
			int n=ps.executeUpdate();
			System.out.println("ɾ����"+n+"��");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
	}

//	@Test
	/*
	 * ����dept_swei���ű�
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
	 * ��������
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
			System.out.println("������"+n+"��");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
//	@Test
	/*
	 * ��ѯ������Ϣ
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
