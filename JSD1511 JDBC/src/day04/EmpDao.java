package day04;

import java.util.List;

/*
 * ����Ա�������CRUD����
 * ����Dao
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
