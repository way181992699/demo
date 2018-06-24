package com.star.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.star.demo.pojo.User;

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

	@RequestMapping("/test")
	public String test(ModelMap map) {
		User u = new User();
		u.setName("Seven");
		u.setAge(29);
		u.setBirthday(new Date());
		u.setPassword("321");
		u.setDesc("<div style='color:green'><b>再次描述<b/></div>");
		map.addAttribute("user", u);
		
		User u1 = new User();
		u1.setAge(19);
		u1.setName("imooc");
		u1.setPassword("123456");
		u1.setBirthday(new Date());
		
		User u2 = new User();
		u2.setAge(17);
		u2.setName("LeeCX");
		u2.setPassword("123456");
		u2.setBirthday(new Date());
		
		List<User> userList = new ArrayList<>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		
		map.addAttribute("userList", userList);
		return "thymeleaf/test";
	}

	@RequestMapping("/star")
	public String star(ModelMap map) {
		User u = new User();
		u.setName("seven");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("321");
		u.setDesc("<div style='color:green'><b>再次描述<b/></div>");
//		u.setName(u.getName());
//		u.setAge(u.getAge());
//		u.setDesc(u.getDesc());
		map.addAttribute("user", u);
		return "thymeleaf/star";
	}
	
	@RequestMapping("/postform")
	public String postform(User u) {
		System.err.println(u.getName());
		System.err.println(u);
		return "redirect:/th/star";
	}

}
