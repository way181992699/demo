package com.star.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.star.demo.pojo.JSONResult;

@Controller
@RequestMapping("err")
public class ErroController {
		@RequestMapping("/error")
		public String erro() {
			
			int  a  = 1 / 0 ;		
			return "thymeleaf/error";
		}
		@RequestMapping("/ajaxerror")
		public String ajaxerror() {
			
			return "thymeleaf/ajaxerror";
		}
		
		@RequestMapping("/getAjaxerror")
		@ResponseBody
		public JSONResult getAjaxerror() {
			
			int a = 1 / 0 ;
			
			return JSONResult.ok("访问正常");
		}
}
