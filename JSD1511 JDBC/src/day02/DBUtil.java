package day02;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * ���ݿ⹤����
 * ��װ���ݿ����ӹ���
 * @author Administrator
 *
 */
public class DBUtil {
	/*
	 * DataSource ��basicDataSource�Ľӿ�
	 * basicDataSource ʵ�� DataSource �ӿ�
	 * 
	 * ���ӳ�һ�����ɣ���ȫ�������̹߳����һ�����ӳض���
	 * ���Զ��徲̬��ֻ��һ�ݣ��ı���
	 */
	private static DataSource ds;
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	private static String innical;
	private static String maxId;
	private static String maxActive;
	/*
	 * ����һ���Եľ�̬��Դ�������ļ�
	 */
	static{
		String file="day02/db.properties";
		Properties cfg=new Properties();
		try {
			InputStream in=DBUtil.class.getClassLoader().getResourceAsStream(file);
			cfg.load(in);
			//��ȡ�����ļ��е�jdbc������Ϣ
			driver=cfg.getProperty("jdbc.driver");
			url=cfg.getProperty("jdbc.url");
			user=cfg.getProperty("jdbc.user");
			pwd=cfg.getProperty("jdbc.pwd");
			System.out.println(driver);
			System.out.println(url);
			System.out.println(user);
			System.out.println(driver);
			/*
			 * ��ʼ�����ӳ�
			 * ���������ļ��󣬵õ������ݿ�����Ӳ���
			 * �������Ӳ�����ʼ���ӳض���
			 */
			innical=cfg.getProperty("jdbc.innical");
			maxId=cfg.getProperty("jdbc.maxid");
			maxActive=cfg.getProperty("jdbc.maxactive");
			System.out.println(innical);
			System.out.println(maxId);
			System.out.println(maxActive);
			BasicDataSource ds=new BasicDataSource();
			ds.setDriverClassName(driver);
			ds.setUrl(url);
			ds.setUsername(user);
			ds.setPassword(pwd);
			ds.setInitialSize(Integer.parseInt(innical));
			ds.setMaxIdle(Integer.parseInt(maxId));
			ds.setMaxActive(Integer.parseInt(maxActive));
			DBUtil.ds=ds;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * ���ӵ����ݿ�
	 */
	public static Connection getConnection() throws SQLException {
		try {
//			String driver="oracle.jdbc.OracleDriver";
//			String url="jdbc:oracle:thin:@localhost:1521:xe";
//			String user="system";
//			String pwd="123456";
//			Class.forName(driver);
//			Connection conn=DriverManager.getConnection(url,user,pwd);
			/*
			 * �޸�DBUtil����������ݿⷽ��
			 * ����Ϊ�������ӳ����ӵ����ݿ�ķ���
			 * DBUtil �Ϳ������ڶ��߳������
			 */
			Connection conn=ds.getConnection();
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * ��������κ��쳣��ת��ΪSQL�쳣���׳�
			 * �ǳ������쳣����ת������
			 */
			throw new SQLException(e);
		}
	}
	
	/*
	 * �ر����ݿ����ӷ���
	 */
	public static void close(Connection conn){
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
