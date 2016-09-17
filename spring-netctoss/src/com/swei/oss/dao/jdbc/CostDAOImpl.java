package com.swei.oss.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.swei.oss.dao.CostDAO;
import com.swei.oss.entity.Cost;
@Repository("costDAO")
public class CostDAOImpl implements CostDAO {
	@Resource(name="ds")
	private DataSource ds;
	public List<Cost> findAll() throws SQLException {
		List<Cost> costs = new ArrayList<Cost>();
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rst = null;
		try {
			conn = ds.getConnection();
			stat = conn.prepareStatement("select * from cost_swei order by cost_id");
			rst = stat.executeQuery();
			if(rst.next()){
				Cost c = createCost(rst);
				costs.add(c);
			}
		} catch (SQLException e) {
			//记日志
			e.printStackTrace();
			//系统异常
			throw e;
		}
		return costs;
	}
	private Cost createCost(ResultSet rs) throws SQLException {
		Cost c = new Cost();
		c.setCostId(rs.getInt("cost_id"));
		c.setName(rs.getString("name"));
		c.setBaseDuration(rs.getInt("base_duration"));
		c.setBaseCost(rs.getDouble("base_cost"));
		c.setUnitCost(rs.getDouble("unit_cost"));
		c.setStatus(rs.getString("status"));
		c.setDescr(rs.getString("descr"));
		c.setCreatime(rs.getTimestamp("creatime"));
		c.setStartime(rs.getTimestamp("startime"));
		c.setCostType(rs.getString("cost_type"));
		return c;
	}
}
