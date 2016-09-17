package org.tedu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.tedu.entity.City;

public class CityServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----����servlet-----");
		List<City> list = new ArrayList<City>();
		list.add(new City(101,"����"));
		list.add(new City(102,"�Ϻ�"));
		list.add(new City(103,"����"));
		//��list����ת����JSON�ַ���
		JSONArray json = JSONArray.fromObject(list);
		String str = json.toString();
		//��str����response���
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print(str);
		out.close();
	}

}
