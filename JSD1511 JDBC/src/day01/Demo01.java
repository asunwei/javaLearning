package day01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo01 {
	public static void main(String[] args)throws Exception{
		
			/*
			 * ʹ��JDBC
			 * 1.��������
			 * ����Class.forName������Oracle��JDBC
			 * �������ص��ڴ���
			 */
			Class.forName("oracle.jdbc.OracleDriver");
			/*
			 * 2.��������
			 * Connection �ӿڣ�����java.sql
			 * ʵ��������Oracle����
			 * ����DriverManager��Ϊ��������Connection �ӿ�ʵ��������
			 * ����DriverManager����Connection
			 */
			String url="jdbc:oracle:thin:@localhost:1521:xe";//IP��ַ
			String user="system";
			String pwd="123456";
			//getConnection ������Ҫ3�������������ҵ�����¼һ��Oracle������
			Connection conn=DriverManager.getConnection(url,user,pwd);
			//һ�������conn���󣬾���ζ�����ݿ����ӳɹ�
			//conn��һ��Connection����,ʵ�������õĶ�����������Oracle������
			//�����������
			System.out.println(conn.getClass().getName());
			//��عر�����
			conn.close();
		
	}
}
