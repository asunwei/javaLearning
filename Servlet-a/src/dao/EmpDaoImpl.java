package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Emp;

public class EmpDaoImpl implements EmpDao {

	public List<Emp> findAll() {
		List<Emp> list = new ArrayList();
		list.add(new Emp(1,"������",1000.0,"�ܼ�"));
		list.add(new Emp(2,"���˾�",800.0,"��ʦ"));
		list.add(new Emp(3,"������",600.0,"��ʦ"));
		return list;
	}

}
