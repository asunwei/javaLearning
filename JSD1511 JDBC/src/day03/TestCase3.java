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
 * ������Ĳ���
 * @author Administrator
 *
 */
public class TestCase3 {
//	@Test
	/*
	 * �������ݿ�Ľ����Ԫ��
	 */
	public void testDateBaseInfo(){
		//�������-----------------------------------
		Connection conn=null;
		try {
			//��鵱ǰ���ݿ�������Ϣ
			conn=DBUtil.getConnection();
			//JDBC �ṩ��һ���ӿڣ�ר�ż�����ݿ������Ϣ
			DatabaseMetaData info=conn.getMetaData();
			//��ȡ���ݿ�Ĳ�Ʒ����
			String name=info.getDatabaseProductName();
			//���汾��    Major:���屾��
			int v=info.getDatabaseMajorVersion();
			//�԰汾��
			int v2=info.getDatabaseMinorVersion();
			System.out.println(v+"."+v2);
			//���кܶ��getXXX�������������ݿ��Ԫ���������Ϣ
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
	}
	
//	@Test
	public void testResultSet(){
		/*
		 * ������У�������������Ϣ��ʱ�򣬾Ϳ���ʹ�ý����
		 * Ԫ�ؽӿ�
		 * ResultSetMetaData
		 * �������������������ÿ�е�������
		 */
		//ʹ�÷�����ResultSet��Ϊ�������ResultSetMetaData
		String sql="select id as \"id\",name as \"name\",pwd as \"pwd\"," +
				" mobile as \"mobile\" ,balance as \"balance\" from robin_account";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			//�õ�Ԫ�ض���
			ResultSetMetaData info=rs.getMetaData();
			//��������м���
			//Column:��  Count: ͳ��
			int n=info.getColumnCount();
			System.out.println(n);
			//��ţ���1��ʼ����n
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
	 *���Խ��� 
	 */
	public void test(int from,int to,double money){
		String dml="update robin_account set balance=balance + ? where id= ?";
		String dql="select balance from robin_account where id=?";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			//�ز��Զ��ύ��Ŀ�ģ���������
			conn.setAutoCommit(false);
			//�����������
			//ִ�пۿ����
			PreparedStatement ps=conn.prepareStatement(dml);
			ps.setDouble(1, -money);
			ps.setInt(2, from);
			int n=ps.executeUpdate();
			//���ۿ���
			if(n!=1){//�ۿ�ɹ�
				//���쳣���ع�����
				throw new SQLException("�ۿ�ʧ��");
			}
			//���ۿ���
			PreparedStatement ps1=conn.prepareStatement(dql);
			ps1.setInt(1, from);
			ResultSet rs=ps1.executeQuery();
			while(rs.next()){
				double b=rs.getDouble("balance");
				if(b<0){
					//�ع�����ȡ���ۿ�
					throw new SQLException("����");
				}
			}
			//��Ŀ���˻����ӽ��
			ps.setDouble(1,money);
			ps.setInt(2, to);
			n=ps.executeUpdate();
			if(n!=1){//Ŀ���˻���������,�ع�
				throw new SQLException("Ŀ���˻�������");
			}
			//���������������Ժ��ύ�������ݿ�
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			//�������ڼ�����κ��쳣���ع���������ʼ��
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
	 * ����ִ��SQL
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
			//���SQl���������������
			st.addBatch(sql1);
			st.addBatch(sql2);
			//��Ӹ���SQL
			//����ִ��SQL �������ݣ�ÿ��SQLһ�����ֽ��
			//���ؽ����
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

