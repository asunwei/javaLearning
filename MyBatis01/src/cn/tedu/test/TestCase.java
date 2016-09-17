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
		//����findAll����ִ��sql���
		
		//�õ�findAll�������ȵõ�AdminMapper�ӿ�
		//AdminMapper �ӿ���Ҫ����SqlSession����
		//SqlSession ��Ҫ��SqlSessionFactory����
		//SqlSessiuonFactory��Ҫ��SqlSessionFactoryBuilde����(�����滻�ļ���)
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//��MyBatis�ṩ��һ�������API�Ӱ��ж�ȡ�����ļ�����
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
		//�ö��������MyBatis�����ļ�sqlMapConfig.xml����sqlSessionFactoryʵ��
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream in = getClass().getClassLoader().getResourceAsStream("sqlMapConfig.xml");
		//ÿһ��MyBatis��Ӧ�ó�����һ��SqlSessionFactory����Ϊ����
		//�ö����𴴽�sqlSession����ʵ��
		SqlSessionFactory factory = builder.build(in);
		//�ö������������sql��������������ִ����ӳ���sql���
		SqlSession session = factory.openSession();
		AdminMapper mapper = session.getMapper(AdminMapper.class);
		List<Admin> all = mapper.findAll();
		for(Admin admin:all){
			System.out.println(admin);
		}
		
	}
}
