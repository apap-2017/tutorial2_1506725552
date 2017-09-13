package com.apap.umarfarisi.tutorial2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
	
	@RequestMapping("/perkalian")
	public String multiplication(@RequestParam(name = "num1" , defaultValue ="0") String num1 , 
			@RequestParam(name = "num2"  , defaultValue ="0") String num2 , 
			Model model) {
		
		int num1Value = parsingParam(num1);
		int num2Value = parsingParam(num2);
		
		model.addAttribute("num1", num1Value);
		model.addAttribute("num2", num2Value);
		model.addAttribute("result", (num1Value * num2Value));
		return "home";
	}
	
	/**
	 * parsing param to be integer from string, non integer param such as "aaaa" will be 0
	 * @param param param to be parsing to integer
	 * @return param with type integer
	 */
	public int parsingParam(String param) {
		try {
			return Integer.valueOf(param);
		}catch(Exception e) {
			return 0;
		}
	}
	
}
