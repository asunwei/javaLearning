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
 * ���ݷ��ʲ��ʵ�֣�
 *   ���þ�������ݷ��ʼ�����jsbc��ʵ��������
 *   ���ʽӿ��е���������
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
			//step1.����־
			e.printStackTrace();
			/*
			 * step2.���쳣�ܷ�ָ�
			 *  ϵͳ�쳣
			 *  �����ϵͳ�쳣���磺���ݿ������ͣ �����жϣ�
			 *  ����ʾ�û��Ժ���ʾ
			 *  Ӧ���쳣
			 *  ���û������������ģ��������������û�����������
			 *  ��ʾ�������룩
			 *  
			 */
			throw e;
		} finally {
			conn.close();
		}
		return admin;
	}
	
}
