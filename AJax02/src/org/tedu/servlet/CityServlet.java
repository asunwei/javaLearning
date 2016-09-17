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
		System.out.println("----进入servlet-----");
		List<City> list = new ArrayList<City>();
		list.add(new City(101,"北京"));
		list.add(new City(102,"上海"));
		list.add(new City(103,"深圳"));
		//将list集合转换成JSON字符串
		JSONArray json = JSONArray.fromObject(list);
		String str = json.toString();
		//将str利用response输出
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print(str);
		out.close();
	}

}
