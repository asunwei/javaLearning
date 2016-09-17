package day04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * ʵ��EmpDao
 * Impl��implement����д��һ�����ڶ���ʵ�ֽӿ�
 */
public class EmpDaoOracleImpl implements EmpDao {
	 

	@Override
	public void add(Emp emp) {
		String sql="insert into emp(empno,ename) values (?,?)";
		//...emp.geEmpno  emp.getname
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			int n=ps.executeUpdate();
			System.out.println("������"+n+"��");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
	}

	@Override
	public void delete(Emp emp) {
		String sql="delete from emp where empno=?";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, emp.getEmpno());
			int n=ps.executeUpdate();
			System.out.println("ɾ����"+n+"��");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
	}

	@Override
	public List<Emp> findAll() {
		String sql="select empno,ename from emp ";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			List<Emp> list=new ArrayList();
			while(rs.next()){
				//��ÿһ�����ݸ��Ƶ�Emp��������ӵ�����
				Emp e=new Emp();//�հ׶���
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
				list.add(e);
			}
			rs.close();
			st.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			DBUtil.close(conn);
		}
	}

	@Override
	public Emp fingById(int id) {
		String sql="select empno,ename from emp where empno=?";
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			Emp e=null;
			while(rs.next()){
				e=new Emp();
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
			}
			return e;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public void update(Emp emp) {
		String sql="update emp set ename=? where empno=?";
		//	
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, emp.getEname());
			ps.setInt(2,emp.getEmpno());
			int n=ps.executeUpdate();
			System.out.println("������"+n+"��");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
	}
	}

	


