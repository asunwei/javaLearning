package cn.tedu.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.tedu.entity.Admin;
import cn.tedu.mapper.AdminMapper;


public class TestCase {
	@Test
	/*public void testFindAll() throws IOException{
		//调用findAll方法执行sql语句
		
		//得到findAll方法，先得到AdminMapper接口
		//AdminMapper 接口需要利用SqlSession创建
		//SqlSession 需要用SqlSessionFactory创建
		//SqlSessiuonFactory需要用SqlSessionFactoryBuilde创建(可以替换文件流)
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//从MyBatis提供的一个方便的API从包中读取配置文件的流
		InputStream in = getClass().getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = builder.build(in);
		SqlSession session = factory.openSession();
		AdminMapper mapper = session.getMapper(AdminMapper.class);
		List<Admin> all = mapper.findAll();
		//System.out.println(all);
		for(Admin admin:all){
			System.out.println(admin);
		}
		session.close();
		
		}*/
	public void testFindAll(){
		//该对象负责根据MyBatis配置文件sqlMapConfig.xml构建sqlSessionFactory实例
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream in = getClass().getClassLoader().getResourceAsStream("sqlMapConfig.xml");
		//每一个MyBatis的应用程序都以一个SqlSessionFactory对象为核心
		//该对象负责创建sqlSession对象实例
		SqlSessionFactory factory = builder.build(in);
		//该对象包含了所有sql操作方法，用于执行已映射的sql语句
		SqlSession session = factory.openSession();
		AdminMapper mapper = session.getMapper(AdminMapper.class);
		List<Admin> all = mapper.findAll();
		for(Admin admin:all){
			System.out.println(admin);
		}
		
	}
}
