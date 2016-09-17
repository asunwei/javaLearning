package cn.tedu.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("adminDao")//´æ´¢
public class AdminDaoImpl implements AdminDao {
	@Resource
	private JdbcTemplate jdbcTemplate;

	public void add(Admin admin) {
		String sql = "insert into admin_info_swei (admin_id,admin_code,password,name,telephone,email,enrolldate) values (?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,
		admin.getAdminId(),
		admin.getAdminCode(),
		admin.getPassword(),
		admin.getName(),
		admin.getEmail(),
		admin.getTelephone(),
		admin.getEnrolldate()
		);
	}

	public void delete(Admin admin) {
		String sql = "delete from admin_info_swei where admin_id=?";
		jdbcTemplate.update(sql,admin.getAdminId());
	}
	
	RowMapper<Admin> rowMapper = new RowMapper<Admin>(){
		public Admin mapRow(ResultSet rs,int index) throws SQLException{
			int id = rs.getInt("admin_id");
			String code = rs.getString("admin_code");
			String name = rs.getString("name");
			String pwd = rs.getString("password");
			String tel = rs.getString("telephone");
			String email = rs.getString("email");
			Timestamp date = rs.getTimestamp("enrolldate");
			return new Admin(id,code,name,pwd,tel,email,date);
		}
	};
	public Admin findByCode(String code) {
		String sql = "select admin_id,admin_code, password,name, telephone, email,enrolldate from admin_info_swei where admin_code=?";
		Admin admin = jdbcTemplate.queryForObject(sql, rowMapper,code);
		return admin;
	}

	public Admin findById(int id) {
		String sql = "select admin_id,admin_code, password,name, telephone, email,enrolldate from admin_info_swei where admin_id=?";
		Admin admin = jdbcTemplate.queryForObject(sql, rowMapper,id);
		return admin;
	}

	public void update(Admin admin) {
		String sql = "update admin_info_swei set admin_code=?,password=?,name=?,telephone=?,email=?,enrolldate=? where admin_id=?";
		jdbcTemplate.update(sql,
				admin.getAdminCode(),
				admin.getPassword(),
				admin.getName(),
				admin.getTelephone(),
				admin.getEmail(),
				admin.getEnrolldate(),
				admin.getAdminId());
				

	}

	public List<Admin> findAll() {
		String sql = "select admin_id, " +
		"admin_code, password, " +
		"name, telephone, email," +
		"enrolldate " +
		"from admin_info_swei ";
		List<Admin> all = jdbcTemplate
		.query(sql, rowMapper);
		return all;
	}

	public List<Map<String, Object>> findForList(int start, int pageSize) {
		
		return null;
	}

}
