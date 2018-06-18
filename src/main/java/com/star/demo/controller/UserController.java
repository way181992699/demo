package com.star.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.star.demo.pojo.JSONResult;
import com.star.demo.pojo.User;


//"*"为传统的springMVC的注释
//*  @Controller
@RestController  //@RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/getUser")
	//* @ResponseBody
	public User getUser(){
		
		User u = new User();
		u.setName("star~~");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("123");
		u.setDesc("hello star~~");
		return u;
	}
	
	@RequestMapping("/getUserJSON")
	//* @ResponseBody
	public JSONResult getUserJSON(){
		User u = new User();
		u.setName("star~~~");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("123");
		
		return JSONResult.ok(u);
	}

}
