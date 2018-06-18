package com.star.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.star.demo.pojo.JSONResult;
import com.star.demo.pojo.MyWife;

@RestController
@RequestMapping("/MyWife")
public class MyWifeController {
	
	@RequestMapping("/getData")
	public JSONResult getData() {
		
		MyWife mw =  new MyWife();
		mw.setAge(18);
		mw.setBirthday(new Date());
		mw.setName("Cindy");
		mw.setSex("未知");
		mw.setDesc("Hello Cindy !~~ haha");
		return JSONResult.ok(mw); 
		
	}
	
}
