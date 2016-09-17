package cn.tedu.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class TestCase {
	public ApplicationContext getCtx(){
		String cfg = "spring-mvc.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
		return ctx;
	}
	
	@Test
	//测试：数据库连接配置文件读取
	public void testJdbc(){
		ApplicationContext ctx = getCtx();
		Properties cfg = ctx.getBean("jdbc",Properties.class);
		System.out.println(cfg);
	}
	
	@Test
	//测试：连接池数据库
	public void testDataBase(){
		ApplicationContext ctx = getCtx();
		DataSource ds = ctx.getBean("dataSource",DataSource.class);
		System.out.println(ds);
	}
	@Test
	//测试springjdbc
	public void testJdbcTemplate(){
		ApplicationContext ctx = getCtx();
		JdbcTemplate tmpl = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		String sql = "select 'HelloWorld' as a from dual";
		String str = tmpl.queryForObject(sql, String.class);
		System.out.println(str);
		System.out.println(1);
	}
	
	@Test
	//测试执行insert语句
	public void tetsInsert(){
		String sql = "insert into admin_info_swei (admin_id,admin_code,password,name,telephone,email,enrolldate) values (?,?,?,?,?,?,?)";
		ApplicationContext ctx = getCtx();
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jdbcTemplate);
		Object[] p = {102,"lilei","1234","jerry","110","jerry@tom.cn",new Date()};
		int n = jdbcTemplate.update(sql,p);
	}
	
	
	//将当前结果集映射到一个对象
	RowMapper<Admin> rowmapper = new RowMapper<Admin>(){
		public Admin mapRow(ResultSet rs,int index) throws SQLException{
			int id = rs.getInt("admin_id");
			String code = rs.getString("admin_code");
			String pwd = rs.getString("password");
			String name = rs.getString("name");
			String tel = rs.getString("telephone");
			String email = rs.getString("email");
			Timestamp date = rs.getTimestamp("enrolldate");
			return new Admin(id,code,pwd,name,tel,email,date);
		}
	};
	@Test
	public void test(){
		String sql = "select * from admin_info_swei where admin_id=?";
		ApplicationContext ctx = getCtx();
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		Admin admin = jdbcTemplate.queryForObject(sql, new Object[]{2000}, rowmapper);
		//                                       sql语句        sql参数            rs的映射集
		System.out.println(admin);
		System.out.println(1);
	}
	
	
	@Test
	public void test2(){
		String sql = "select * from admin_info_swei where admin_id>?";
		ApplicationContext ctx = getCtx();
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		List<Admin> list = jdbcTemplate.query(sql, rowmapper, new Object[]{0});
		System.out.println(list);
	}
	
	RowMapper<Map<String,Object>> toMap = new RowMapper<Map<String,Object>>(){
		public Map<String,Object> mapRow(ResultSet rs,int index) throws SQLException{
			Map<String,Object> map = new HashMap<String,Object>();
			//将一行的rs中的数据映射到map对象中
				map.put("id", rs.getInt("admin_id"));
				map.put("name", rs.getString("name"));
			return map;
		}
	};
	
	@Test
	public void test3(){
		String sql = "select admin_id,name from admin_info_swei";
		JdbcTemplate jdbcTemplate = getCtx().getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jdbcTemplate);
		List<Map<String,Object>> list = jdbcTemplate.query(sql, toMap);
		for(Map<String,Object> row:list){
			System.out.println(row);
		}
	}
	
	@Test
	/**
	 * 测试执行 Insert 语句
	 */
	public void testInsert2(){
		String sql = "insert into " +
			"admin_info_swei"+ 
			"(admin_id, admin_code, " +
			" password, name,"+
			" telephone, email, enrolldate)"+
			" values (?,?,?,?,?,?,?)";
		ApplicationContext ctx = 
			getCtx();
		JdbcTemplate jdbcTemplate=
			ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jdbcTemplate);
		System.out.println(1);
		jdbcTemplate.update(sql, 101, "2012", "123","Jerry", "110", "jerry@tom.cn",new Date());
	}
	
	@Test
	public void testAdd(){
		AdminDao dao = getCtx().getBean("adminDao",AdminDao.class);
		Admin a= new Admin(104,"lilei","1234","jerry","110","jerry@tom.cn",new Timestamp(1111111));
//		Admin a = new Admin();
//		a.setAminId(103);
//		a.setAdminCode("lilei");
//		a.setPassword("123");
//		a.setName("jerry");
//		a.setTelephone("110");
//		a.setEmail("jerry@163.com");
//		a.setEnrolldate( (Timestamp) new Date());
		dao.add(a);
		
	}
	@Test
	public void testDelete(){
		AdminDao dao = getCtx().getBean("adminDao",AdminDao.class);
		Admin a = new Admin();
		a.setAdminId(102);
		dao.delete(a);
		System.out.println(a);
	}
	
	@Test
	public void testFindByCode(){
		AdminDao dao = getCtx().getBean("adminDao",AdminDao.class);
		Admin a = dao.findByCode("2012");
		System.out.println(a);
	}
	@Test
	public void testFindById(){
		AdminDao dao = getCtx().getBean("adminDao",AdminDao.class);
		Admin a = dao.findById(109);
		System.out.println(a);
	}
	@Test
	public void testUpdate(){
		AdminDao dao = getCtx().getBean("adminDao",AdminDao.class);
		Admin a = new Admin(104,"lilei","111111111111","jerry","110","jerry@tom.cn",new Timestamp(1111111));
		dao.update(a);
		System.out.println(a);
	}
	
	@Test
	public void testFindAll(){
		AdminDao dao = getCtx().getBean("adminDao",AdminDao.class);
		List<Admin> list = dao.findAll();
		System.out.println(list);
	}
	
	@Test
	public void test7(){
		Admin Admin = new Admin();
		System.out.println(1);
	}
}
