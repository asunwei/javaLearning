package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBUtil;
import entity.Admin;

public class AdminDaoImpl implements AdminDao {

	public Admin findById(String adminCode) {
		System.out.println(adminCode);
		Connection con = null;
		try {
			con = DBUtil.getConnection();
			String sql = "select * from admin_info_swei where admin_code=?";
			PreparedStatement ps = con.prepareCall(sql);
			ps.setString(1, adminCode);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Admin a = new Admin();
				a.setAminId(rs.getInt("admin_id"));
				a.setAdminCode(rs.getString("admin_code"));
				a.setPassword(rs.getString("password"));
				a.setName(rs.getString("name"));
				a.setTelephone(rs.getString("telephone"));
				a.setEmail(rs.getString("email"));
				a.setEnrolldate(rs.getTimestamp("enrolldate"));
				return a;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("��ѯʧ�ܣ�",e);
		} finally {
			DBUtil.close(con);
		}
		return null;
	}
	public static void main(String[] args) {
		AdminDao dao = new AdminDaoImpl();
		
		Admin a = dao.findById("caocao");
		System.out.println(a.getName()+","+a.getAminId());
	}

}
