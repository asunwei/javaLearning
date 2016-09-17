package cn.tedu;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.tedu.entity.Dept;
import cn.tedu.mapper.DeptMapper;

@Component
public class DemoBean {
	@Resource
	DeptMapper deptMapper;
	public void demo(){
		List<Dept> list =deptMapper.findAll();
		for(Dept d:list){
			System.out.println(d);
		}
	}
}
