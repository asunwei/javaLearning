package cn.tedu.mapper;

import java.util.List;
import java.util.Map;

import cn.tedu.entity.Dept;
@MapperBean
public interface DeptMapper {
	List<Dept> findAll();
	void addDept(Dept dept);
	void deleteDept(Dept dept);
	Dept findDeptById(Integer deptNo);
	void updateDept(Dept dept);
	List<Map<String,Object>> findDeptAll();
}
