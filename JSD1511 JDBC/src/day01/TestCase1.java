package day01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
/**
 * Test ����
 * Case ����
 * @author Administrator
 *
 */
public class TestCase1 {
	/*
	 * Java5 �Ժ���﷨��
	 * ���޷���ֵ�ģ��޲����Ĺ��з���֮ʹ��
	 * @Test�Ϳ���ʹ��junit����ִ���������
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
	 * ����в�������
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
			System.out.println("������"+n+"��");
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
	 * �ڱ��и�������
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
			System.out.println("������"+n+"��");
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
	 * ��ѯ���
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
			 * ִ��DQL��䣬ʹ��st.executeQuery(dql);
			 * ����������ResultSet����
			 */
			ResultSet rs=st.executeQuery(sql);
			//����ResultSet����
			while(rs.next()){
				int n=rs.getInt("deptno");
				int n1=rs.getInt(1);//���ã�������
				String str=rs.getString("dname");
				String str1=rs.getString(2);//���ã�������
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
	 * ���Ա������ķ���
	 */
//	@Test
	public void TestSave(){
		Dept d=new Dept(5,"JAVA");
		//ִ���Ժ��Ŷ��󱣴浽���ݿ���
		save(d);
		System.out.println("������ɣ�");
	}
	/*
	 * ��װ���󱣴����
	 */
	public void save(Dept dept){
		System.out.println(dept.getDeptno()+3);
		System.out.println(dept.getDname());
		/*
		 * SQL �����ƴ�ӵ�ʱ��Ҫע''(�ֺ�)��
		 * ƴ�Ӵ��������﷨����
		 */
		//dept deptno=5 dname="Java" 
		String sql="insert into robin_dept (deptno,dname) values("+dept.getDeptno()+",'"+dept.getDname()+"')";
		//ִ��DML���
		Connection cnn=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String pwd="123456";
			cnn=DriverManager.getConnection(url,user,pwd);
			Statement st=cnn.createStatement();
			int n=st.executeUpdate(sql);
			System.out.println("������"+n+"��");
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
	 * ���Զ������Ӳ���
	 */
//	@Test
	public void testFindById(){
		//���ݶ����ID�����ݿ����Ҵ����
		Dept d=findById(5);
		System.out.println(d);
	}
	/*
	 * �����һز���
	 * ���ݲ������������һز��Ŷ���
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
			//��ѯ���rs
			//����ķ���ֵ Dept ���Ŷ���
			//��rs�е����ݶ�ȡ�����Ŷ���
			// dept ��ֵΪnull��Ŀ���ǣ���û��
            // ��ѯ����������ֱ�ӷ���null
            // ���ڱ�ʾ��ѯ���Ϊ���ա���
			Dept dept=null;
			while(rs.next()){
				//����ǰ�е�����
				int n=rs.getInt("deptno");
				String name=rs.getString("dname");
				dept=new Dept();
				dept.setDeptno(n);
				dept.setDname(name);
			}
			//����null��ʾû���������
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
