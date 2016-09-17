package com.swei.oss.service.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.swei.oss.dao.AdminDAO;
import com.swei.oss.entity.Admin;
import com.swei.oss.service.LoginService;
/**
 * ҵ����ʵ��
 * @author Administrator
 *
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService{
	@Resource(name="adminDAO")
	private AdminDAO dao;
	public Admin checkLogin(String adminCode, String pwd) throws Exception {
		System.out.println("chenckLogin����ִ����...");
		Admin admin = null;
		try {
			admin = dao.findByAdminCode(adminCode);
			if(admin == null){
				//Ӧ���쳣���ʺŲ�����
				throw new ApplicationException("�ʺŲ����ڣ�");
			}
			if(!admin.getPassword().equals(pwd)){
				//Ӧ���쳣���������
				throw new ApplicationException("�������");
			}
		} catch (Exception e) {
			//����־
			e.printStackTrace();
			//ϵͳ�쳣���׳�
			throw e;
		}
		return admin;
	}

}
