package com.swei.oss.dao;

import com.swei.oss.entity.Admin;
/**
 *数据访问接口：
 *  声明一系列的数据访问方法。 
 *
 */
public interface AdminDAO {
	public Admin findByAdminCode(String code) throws Exception;
}
