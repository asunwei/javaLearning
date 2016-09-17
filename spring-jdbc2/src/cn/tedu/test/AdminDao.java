package cn.tedu.test;

import java.util.List;
import java.util.Map;

public interface AdminDao {
	void add(Admin admin);
	void delete(Admin admin);
	void update(Admin admin);
	Admin findById(int id);
	Admin findByCode(String code);
	List<Admin> findAll();
	List<Map<String,Object>> findForList(int start,int	pageSize);
	
}
