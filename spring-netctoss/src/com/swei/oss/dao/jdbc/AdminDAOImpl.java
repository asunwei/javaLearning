package com.swei.oss.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.swei.oss.dao.AdminDAO;
import com.swei.oss.entity.Admin;

/**
 * 数据访问层的实现：
 *   采用具体的数据访问技术（jsbc）实现了数据
 *   访问接口中的声明方法
 * @author Administrator
 *
 */
@Repository("adminDAO")
public class AdminDAOImpl implements AdminDAO{
	@Resource(name="ds")
	private DataSource ds;
	public Admin findByAdminCode(String code) throws SQLException {
		Admin admin = null;
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rst = null;
		try {
			conn = ds.getConnection();
			stat = conn.prepareStatement("select * from admin_info_swei where admin_code=?");
			stat.setString(1, code);
			rst = stat.executeQuery();
			if(rst.next()){
				admin = new Admin();
				admin.setAminId(rst.getInt("admin_id"));
				admin.setAdminCode(rst.getString("admin_code"));
				admin.setPassword(rst.getString("password"));
				admin.setName(rst.getString("name"));
				admin.setTelephone(rst.getString("telephone"));
				admin.setEmail(rst.getString("email"));
				admin.setEnrolldate(rst.getTimestamp("enrolldate"));
				return admin;
			}
		} catch (SQLException e) {
			//step1.记日志
			e.printStackTrace();
			/*
			 * step2.看异常能否恢复
			 *  系统异常
			 *  如果是系统异常（如：数据库服务暂停 网络中断）
			 *  则提示用户稍后提示
			 *  应用异常
			 *  （用户错误操作引起的，比如输入错误的用户名或者密码
			 *  提示重新输入）
			 *  
			 */
			throw e;
		} finally {
			conn.close();
		}
		return admin;
	}
	
}
