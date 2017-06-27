package com.learn.java.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class BlogsDaoImpl2 implements BlogsDao {
	// @Autowired
	// @Qualifier("namedJdbcTemplate")
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	// @Autowired
	// @Qualifier("sql")
	private String sql;

	// @Override
	// public Blogs findBlogs() {
	// // TODO Auto-generated method stub
	// List list= namedJdbcTemplate.query(sql, rse)
	//
	// return list;
	// }

	// public void setJdbcT(JdbcTemplate jdbcT) {
	// this.jdbcT = jdbcT;
	// }

	public NamedParameterJdbcTemplate getNamedJdbcTemplate() {
		return namedJdbcTemplate;
	}

	public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	@Override
	public Blogs findBlogs() {
		final Map<String, Object> sqlParamaterMap = new HashMap<String, Object>();
		sqlParamaterMap.put("number", 3);
		sqlParamaterMap.put("name", "Tom");
		sqlParamaterMap.put("password", "963");
		sqlParamaterMap.put("email", "753159@sina.com");
		SqlParameterSource namedParameters = new MapSqlParameterSource(sqlParamaterMap);
		// final List<Blogs> blogsList = new ArrayList<Blogs>();
		Blogs blogs = (Blogs) namedJdbcTemplate.queryForObject(sql, namedParameters, new RowMapper<Blogs>() {
			public Blogs mapRow(ResultSet rs, int rowNum) throws SQLException {
				final Blogs blogs = new Blogs();
				blogs.setUserNumber((int) rs.getObject("user_number"));
				blogs.setUserName((String) rs.getObject("user_name"));
				blogs.setUserPassword((String) rs.getObject("user_password"));
				blogs.setUserEmail((String) rs.getObject("user_email"));
				return blogs;

			}

		});

		return blogs;
	}

	// @Override
	// public Blogs findBlogs() {
	// final Map<String, Object> sqlParamaterMap = new HashMap<String,
	// Object>();
	// sqlParamaterMap.put("number", 1);
	// sqlParamaterMap.put("name", "JIM");
	// sqlParamaterMap.put("password", "123");
	// sqlParamaterMap.put("email", "753159@sina.com");
	// //final List<Blogs> blogsList = new ArrayList<Blogs>();
	// Blogs blogs = (Blogs) namedJdbcTemplate.queryForObject(sql,
	// sqlParamaterMap,new ResultSetExtractor(){
	// @Override
	// public Object extractData(ResultSet rs) throws SQLException,
	// DataAccessException {
	// // TODO Auto-generated method stub
	// final Blogs blogs = new Blogs();
	// while(rs.next()){
	// blogs.setUserNumber((int)rs.getObject("user_number"));
	// blogs.setUserName((String)rs.getObject("user_name"));
	// blogs.setUserPassword((String)rs.getObject("user_password"));
	// blogs.setUserEmail((String)rs.getObject("user_email"));
	// }
	// return blogs;
	// }
	// });
	//
	// return (Blogs) list.get(0);
	// }
}
