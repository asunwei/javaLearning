package com.swei.oss.service;

import com.swei.oss.entity.Admin;

/**
 * ҵ���ӿ�
 *
 */
public interface LoginService {
	public Admin checkLogin(String adminCode,String pwd) throws Exception;
}
