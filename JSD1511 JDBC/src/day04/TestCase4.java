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
		 * �����ݿ�������������
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
				//addBatch��������ӵ�ps������
				ps.addBatch();
				if(i%100==0){
					//ÿ100�����ݷ���һ��
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
	 * ��ϰ����
	 */
	public void testArray(){
		int [] ary= new int[4];
		//ֻ��������������ͬʱ��ʼ��
		int[] ary2={2,3,4};
		int[] ary3=new int[]{2,3,4};
		
		int[] ary4;
//		ary4={2,3,4};//������󣬲��ܵ�����ʼ��,���ָ�ʽ
		ary4=new int[]{2,3,4};
		
		//����������
		String[]  a1= new String[6];
		String[]  a2={"tom","jerry"};
		String[]  a3=new String[]{"tom","jerry"};
		
		String[] a4;
//		a4={"tom","jerry"};//�������
		a4=new String[]{"tom","jerry"};
		
		testStringAry(new String[]{"tom","jerry"});
	}
	public void testStringAry(String[] a){
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
//	@Test
	/*
	 * ��ȡ�Զ����ɵ����
	 * 
	 * ʹ�ó��ϣ�
	 * ���ǲ������ݣ�������ȡID�ĳ��϶�Ҫʹ��
	 * �� ע��
	 *     1�����û������һ��
	 *     insert into user
	 *     (id,name,pwd) values (seq_user.nextval,?,?)
	 *     ��ȡ���ɵ�userId
	 *     2�����˻����У������˻�����80Ԫ
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
			 * ��ȡ�Զ����ɵ�����
			 * getGeneratedKeys �봴��psʱ��Ĳ���new String[]{"empno"}
			 * ���ʹ�ã�����ֵ�������ɵ���
			 */
			ResultSet rs=ps.getGeneratedKeys();
			int empno=-1;
			while(rs.next()){
				//��ȡ���ɵ��У�ʹ���кŻ�ȡ
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
	 * ʹ��Dao �ǳ���࣬���÷�������
	 * dao ��JDBC������װ��
	 */
	public void test(){
		Emp e=new Emp(2,"Jerry");
		EmpDao dao=new EmpDaoOracleImpl();
//		dao.add(e);
//		dao.delete(e);
		List<Emp> all=dao.findAll();
		/*
		 * ����Ա��������
		 */
		Collections.sort(all,new Comparator<Emp>(){
			public int compare(Emp o1,Emp o2){
				//����empno��С�Ƚ�
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
	 * ���������ܽ�
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
   * �Զ���������
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
			 * ��ȡ�Զ����ɵ�����
			 * getGeneratedKeys �봴��psʱ��Ĳ���new String[]{"empno"}
			 * ���ʹ�ã�����ֵ�������ɵ���
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
