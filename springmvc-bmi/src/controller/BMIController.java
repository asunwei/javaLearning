package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BMIController {
	@RequestMapping("/toBmi.do")
	public String toBMI(){
		return "bmi_form";
	}
	
	@RequestMapping("/bmi.do")
	public String bmiProcess(BmiParam bp,ModelMap data){
		double bmi = bp.getWeight()/bp.getHeight()/bp.getHeight();
		String status = "正常";
		if(bmi>24){
			status="过重";
		}
		data.addAttribute("status",status);
		return "view";
	}
}

