package day01;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * �������ݿ�
 * ִ��DDL������
 * @author Administrator
 *
 */
/*
 * JDBC ����
 * 1��ע�������ɹ�������������Ŀ�ģ�����JDBC��ʵ������
 * 2���������ݣ�����Connection����Ŀ��������java
 *    ��������ݿ�ֱ��ͨѶ����
 * 3������Statement����䣩���󣬵ײ�������������������SQL
 * 4��ִ��SQL��������Statement����ķ�����SQL���͵����ݿ�
 *    ���������ݿ�ִ��
 * 5������SQLִ�еĽ����boolean in ResultSet
 * 6���ر�����conn.close(),�ر�TCP
 */
public class Demo02 {
	public static void main(String[] args) throws Exception{
		//1 ��������
		Class.forName("oracle.jdbc.OracleDriver");
		//2 ��������
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pwd="123456";
		Connection conn=DriverManager.getConnection(url,user,pwd);
		//3 ����Statement
		Statement st=conn.createStatement();
		//4 ִ��DDL
		String ddl="create table robin_dept("+"deptno number(6),"+"dname varchar2(50))";
		//����execute������DDL�������ݿ���ִ��
		boolean b = st.execute(ddl);
		//����ֵfalse����ʾû�н����
		//5 �����ѯ���
		System.out.println(b);//false
		System.out.println(st.getClass().getName());
		//6 �ر�����
		conn.close();
	}
}
