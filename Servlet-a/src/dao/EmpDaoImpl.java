package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Emp;

public class EmpDaoImpl implements EmpDao {

	public List<Emp> findAll() {
		List<Emp> list = new ArrayList();
		list.add(new Emp(1,"刘苍松",1000.0,"总监"));
		list.add(new Emp(2,"王克晶",800.0,"讲师"));
		list.add(new Emp(3,"范传奇",600.0,"讲师"));
		return list;
	}

}
