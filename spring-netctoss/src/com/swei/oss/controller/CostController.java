package com.swei.oss.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swei.oss.entity.Cost;
import com.swei.oss.service.CostService;
@Controller
public class CostController {
	@Resource(name="costService")
	private CostService service;
	@RequestMapping("/cost.do")
	public String cost(ModelMap data){
		System.out.println("cost方法执行了...");
		List<Cost> costs;
		try {
			costs = service.list();
			data.addAttribute("costs",costs);
		} catch (Exception e) {
			// 记日志
			e.printStackTrace();
			//系统异常，跳转到错误页面
			return "error";
		}
		return "fee_list";
	}
}
