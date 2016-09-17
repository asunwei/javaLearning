package day02;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * 数据库工具类
 * 封装数据库连接过程
 * @author Administrator
 *
 */
public class DBUtil {
	/*
	 * DataSource 是basicDataSource的接口
	 * basicDataSource 实现 DataSource 接口
	 * 
	 * 连接池一个即可，被全部的子线程共享的一个连接池对象，
	 * 所以定义静态（只有一份）的变量
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
	 * 加载一次性的静态资源：配置文件
	 */
	static{
		String file="day02/db.properties";
		Properties cfg=new Properties();
		try {
			InputStream in=DBUtil.class.getClassLoader().getResourceAsStream(file);
			cfg.load(in);
			//读取配置文件中的jdbc参数信息
			driver=cfg.getProperty("jdbc.driver");
			url=cfg.getProperty("jdbc.url");
			user=cfg.getProperty("jdbc.user");
			pwd=cfg.getProperty("jdbc.pwd");
			System.out.println(driver);
			System.out.println(url);
			System.out.println(user);
			System.out.println(driver);
			/*
			 * 初始化连接池
			 * 加载配置文件后，得到了数据库的连接参数
			 * 利用连接参数初始连接池对象
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
	 * 连接到数据库
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
			 * 修改DBUtil类的连接数据库方法
			 * 更新为利用连接池连接到数据库的方法
			 * DBUtil 就可以用在多线程情况下
			 */
			Connection conn=ds.getConnection();
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * 将捕获的任何异常都转换为SQL异常再抛出
			 * 是常见的异常类型转换技巧
			 */
			throw new SQLException(e);
		}
	}
	
	/*
	 * 关闭数据库连接方法
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
