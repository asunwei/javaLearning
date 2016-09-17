package com.swei.oss.service.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.swei.oss.dao.AdminDAO;
import com.swei.oss.entity.Admin;
import com.swei.oss.service.LoginService;
/**
 * 业务层的实现
 * @author Administrator
 *
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService{
	@Resource(name="adminDAO")
	private AdminDAO dao;
	public Admin checkLogin(String adminCode, String pwd) throws Exception {
		System.out.println("chenckLogin方法执行了...");
		Admin admin = null;
		try {
			admin = dao.findByAdminCode(adminCode);
			if(admin == null){
				//应用异常，帐号不存在
				throw new ApplicationException("帐号不存在！");
			}
			if(!admin.getPassword().equals(pwd)){
				//应用异常，密码错误
				throw new ApplicationException("密码错误！");
			}
		} catch (Exception e) {
			//记日志
			e.printStackTrace();
			//系统异常，抛出
			throw e;
		}
		return admin;
	}

}
