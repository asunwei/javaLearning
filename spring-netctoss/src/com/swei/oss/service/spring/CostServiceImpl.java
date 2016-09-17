package com.swei.oss.service.spring;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.swei.oss.dao.CostDAO;
import com.swei.oss.entity.Cost;
import com.swei.oss.service.CostService;
@Service("costService")
public class CostServiceImpl implements CostService {
	@Resource(name="costDAO")
	private CostDAO dao;
	public List<Cost> list() throws Exception {
		List<Cost> costs = new ArrayList<Cost>();
		try {
			costs = dao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return costs;
	}
	
}
