package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制类
 * 用于演示异常现象，只抛异常，不对异常处理
 * @author Administrator
 *
 */
@Controller
public class ExceptionDemoController {
	@RequestMapping("/demo.do")
	public String name(int i){
		//人为抛出异常
		int[] ary = {3,4,5};
		ary[i] = 9;
		return "ok";
	}
}
