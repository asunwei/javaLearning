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
		System.out.println("cost����ִ����...");
		List<Cost> costs;
		try {
			costs = service.list();
			data.addAttribute("costs",costs);
		} catch (Exception e) {
			// ����־
			e.printStackTrace();
			//ϵͳ�쳣����ת������ҳ��
			return "error";
		}
		return "fee_list";
	}
}
