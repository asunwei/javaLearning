package com.swei.oss.dao;

import com.swei.oss.entity.Admin;
/**
 *���ݷ��ʽӿڣ�
 *  ����һϵ�е����ݷ��ʷ����� 
 *
 */
public interface AdminDAO {
	public Admin findByAdminCode(String code) throws Exception;
}
