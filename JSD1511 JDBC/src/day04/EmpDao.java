package day04;

import java.util.List;

/*
 * 声明员工对象的CRUD方法
 * 调用Dao
 * Emp e=new Emp(5,"TOM")
 * 
 */
public interface EmpDao {
	void add(Emp emp);
	void delete(Emp emp);
	void update(Emp emp);
	List<Emp>findAll();
	Emp fingById(int id);
}
