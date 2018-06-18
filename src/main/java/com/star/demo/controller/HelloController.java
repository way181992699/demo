package com.star.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.star.demo.pojo.JSONResult;
import com.star.demo.pojo.Resource;

@RestController
public class HelloController {

	@Autowired
	private Resource resource;

	@RequestMapping("/hello")
	public Object fun() {
		return "star";
	}

	@RequestMapping("/getResource")
	public JSONResult getResource() {
 
		Resource r = new Resource();
		BeanUtils.copyProperties(resource, r);

		return JSONResult.ok(r);
	}

}
