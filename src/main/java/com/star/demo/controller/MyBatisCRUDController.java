package com.star.demo.controller;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.star.demo.pojo.JSONResult;
import com.star.demo.pojo.SysUser;
import com.star.demo.service.UserService;

@RestControllerAdvice
@RequestMapping("mybatis")
public class MyBatisCRUDController {
	@Autowired
	private Sid id;
	
	@Autowired
	private UserService service;

	@RequestMapping("/add")
	public JSONResult add() throws Exception {
	
		SysUser user = new SysUser();
		String userId = id.nextShort();
		user.setId(6);
		service.saveUser(user);
		return JSONResult.ok("保存成功");
		
	}

}
