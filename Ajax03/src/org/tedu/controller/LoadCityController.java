package org.tedu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tedu.entity.City;
@Controller
@RequestMapping("/city")
public class LoadCityController {
	@RequestMapping("/load.do")//ɨ��ƥ������uri
	@ResponseBody//��cityת����json�ַ������
	public City excute(){
		City c = new City(101,"����");
		return c;
	}
	
	@RequestMapping("/test1.do")
	@ResponseBody
	public boolean f1(){
		return true;
	}
	
	@RequestMapping("/load_all.do")
	@ResponseBody
	public List<City> f2(){
		List<City> list = new ArrayList<City>();
		list.add(new City(101,"����"));
		list.add(new City(102,"�Ϻ�"));
		return list;
	}
}
