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
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("result", (Integer.valueOf(num1) * Integer.valueOf(num2)));
		return "home";
	}
}
