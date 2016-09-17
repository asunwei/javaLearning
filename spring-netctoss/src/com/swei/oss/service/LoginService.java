package com.swei.oss.service;

import com.swei.oss.entity.Admin;

/**
 * 业务层接口
 *
 */
public interface LoginService {
	public Admin checkLogin(String adminCode,String pwd) throws Exception;
}
