package com.swei.oss.dao;

import java.sql.SQLException;
import java.util.List;

import com.swei.oss.entity.Cost;

public interface CostDAO {
	public List<Cost> findAll() throws Exception;
}
