package com.star.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("th")
public class ThymeleafController {
	
			@RequestMapping("/index")
				public String index(ModelMap map) {
				map.addAttribute("name", "thymeleaf-test");
				return "thymeleaf/index.html";
			}
			@RequestMapping("/center")
			public String center(ModelMap map) {
			
			return "thymeleaf/center/center";
		}
		
}
