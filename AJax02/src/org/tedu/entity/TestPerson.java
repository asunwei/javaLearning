package org.tedu.entity;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;

public class TestPerson {
	@Test
	//��һ��Person����ת��ΪJSON�ַ���
	public void test1(){
		Person p = new Person("tom",20);
		JSONObject json = JSONObject.fromObject(p);
		String str = json.toString();
		System.out.println(str);
	}
	@Test
	//��һ�����ϵĶ���ת��ΪJSON�ַ���
	public void test2(){
		List<Person> list = new ArrayList<Person>();
		Person p1 = new Person("jack",22);
		Person p2 = new Person("rose",18);
		list.add(p1);
		list.add(p2);
		JSONArray json = JSONArray.fromObject(list);
		String str = json.toString();
		System.out.println(str);
	}
}
