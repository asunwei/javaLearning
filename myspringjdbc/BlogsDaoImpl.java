package com.learn.java.springjdbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class BlogsDaoImpl implements BlogsDao{
	private JdbcTemplate jdbcT;

	public void setJdbcT(JdbcTemplate jdbcT) {
		this.jdbcT = jdbcT;
	}

	@Override
	public Blogs findBlogs() {
		String sql = "select * from blog_user";
		List list = jdbcT.queryForList(sql);
		Iterator iterator = list.iterator();
		Blogs blogs = null;
		while (iterator.hasNext()) {
			Map map4blogs = (Map) iterator.next();
			blogs = new Blogs();
			blogs.setUserNumber((int)map4blogs.get("user_number"));
			blogs.setUserName((String)map4blogs.get("user_name"));
			blogs.setUserPassword((String)map4blogs.get("user_password"));
			blogs.setUserEmail((String)map4blogs.get("user_email"));
		}
		return blogs;
		
	}
}
