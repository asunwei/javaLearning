package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ������
 * ������ʾ�쳣����ֻ���쳣�������쳣����
 * @author Administrator
 *
 */
@Controller
public class ExceptionDemoController {
	@RequestMapping("/demo.do")
	public String name(int i){
		//��Ϊ�׳��쳣
		int[] ary = {3,4,5};
		ary[i] = 9;
		return "ok";
	}
}
