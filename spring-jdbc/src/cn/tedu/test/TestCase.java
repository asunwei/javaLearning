package cn.tedu.test;

import java.util.Properties;

import javax.sql.DataSource;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;



public class TestCase {
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
		System.out.println(ac);
		Properties jdbc = ac.getBean("jdbc",Properties.class);
		System.out.println(jdbc);
		DataSource da = ac.getBean("dataSource",DataSource.class);
		System.out.println(da);
		JdbcTemplate tmpl = ac.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(tmpl);
		String sql = "select 8 as a from dual";
		Integer a = tmpl.queryForObject(sql, Integer.class);
		System.out.println(a);
	}
}
