package cn.tedu.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.Properties;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.DemoBean;
import cn.tedu.entity.Dept;
import cn.tedu.mapper.DeptMapper;

public class TestCase {
	/*@Test
	public void testFindAll() throws IOException {
		DeptMapper mapper ;
		//利用MyBatis的API作为工厂创建mapper
		Reader in = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(in);
		SqlSession session = factory.openSession();
		mapper = session.getMapper(DeptMapper.class);
		List<Dept> list = mapper.findAll();
		for(Dept d : list){
			System.out.println(d);
		}
		session.close();
	}*/
	
	@Test
	public void testFindAll2() throws IOException{
		DeptMapper mapper;
		Reader in = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(in);
		SqlSession session = factory.openSession();
		mapper  = session.getMapper(DeptMapper.class);
		List<Dept> list = mapper.findAll();
		for(Dept d : list){
			System.out.println(d);
		}
		session.close();
	}
	@Test
	public void testAdd() throws IOException{
		DeptMapper mapper;
		Reader in = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(in);
		SqlSession session = factory.openSession();
		mapper  = session.getMapper(DeptMapper.class);
		Dept d = new Dept(300,"IOS","潘家园");
		mapper.addDept(d);
		session.commit();
		session.close();
	}
	
	public SqlSession getSession() throws IOException{
		Reader in = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(in);
		SqlSession session = factory.openSession();
		return session;
	}
	@Test
	public void testDeleteDept() throws Exception{
		SqlSession session = getSession();
		DeptMapper mapper = session.getMapper(DeptMapper.class);
		//根据id查找
		Dept d = mapper.findDeptById(300);
		//调方法删除
		mapper.deleteDept(d);
		session.commit();
		session.close();
	}
	
	@Test 
	public void testUpdateDept() throws IOException{
		SqlSession session = getSession();
		DeptMapper mapper = session.getMapper(DeptMapper.class);
		Dept d = mapper.findDeptById(200);
		d.setDname("web 前端");
		d.setLoc("万寿路");
		mapper.updateDept(d);
		session.commit();
		session.close();
	}
	
	@Test
	public void testFindDeptAll() throws IOException{
		SqlSession session = getSession();
		DeptMapper mapper = session.getMapper(DeptMapper.class);
		List<Map<String, Object>> list = mapper.findDeptAll();
		for(Map<String, Object> map:list){
			System.out.println(map);
		}
		session.close();
	}
	
	@Test
	public void testSqlSession() throws IOException{
		SqlSession session = getSession();
		//直接执行sql语句，参数是Sql的Id属性
		//这里的sql是mapper文件中sql语句
		List<Map<String,Object>> list = session.selectList("findDeptAll");
		for(Map<String,Object> row:list){
			System.out.println(row);
		}
		session.close();
	}
	
	public ApplicationContext getCtx(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
		return ctx;
	}
	@Test
	public void testMapper(){
		DeptMapper mapper = getCtx().getBean("deptMapper",DeptMapper.class);
		System.out.println(mapper);
		List<Dept> list = mapper.findAll();
		for(Dept d:list){
			System.out.println(d);
		}
	}
	@Test
	public void testDemoBean(){
		DemoBean demo = getCtx().getBean("demoBean",DemoBean.class);
		demo.demo();
	}
}
