package com.star.demo.controller;

import java.util.Date;

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
		System.out.println("1");
		SysUser user = new SysUser();
		String userId = id.nextShort();
		user.setId(userId);
		user.setAge(1);
		user.setPassword("891220" + new Date());
		user.setSex("未知");
		user.setUsername("隔壁老王" + new Date());
		user.setJob("programme");
		service.saveUser(user);
		return JSONResult.ok("保存成功");

	}

	@RequestMapping("/edit")
	public JSONResult edit() throws Exception {
		SysUser user = new SysUser();
		user.setId("18062866P28CS70H");
		user.setAge(1);
		user.setPassword("891220" + new Date());
		user.setSex("nan");
		user.setUsername("隔壁老王" + new Date());
		service.updateUser(user);
		return JSONResult.ok("修改成功");

	}

	@RequestMapping("/del")
	public JSONResult del() throws Exception {
		String userId = "18062866P28CS70H";
		service.deleteUser(userId);
		return JSONResult.ok("删除成功");

	}
	
	@RequestMapping("/query")
	public JSONResult query() throws Exception{
		String userId = "1806286703G3NF80";
		return JSONResult.ok(service.queryUserById(userId));
	}
		
	@RequestMapping("/queryList")
	public JSONResult queryList() throws Exception{
		String userId = "1806286703G3NF80";
		SysUser user = new SysUser();
//		user.setSex("1");
//		user.setId(userId);
		user.setJob("3");
		return JSONResult.ok(service.queryUserList(user));
	}
	@RequestMapping("/queryListPage")
	public JSONResult queryListPage(Integer page) throws Exception{
		if (page==null) {
			 page=1;
		}
		Integer pageSize = 5;
		String userId = "1806286703G3NF80";
		SysUser user = new SysUser();
//		user.setSex("1");
//		user.setId(userId);
//		user.setJob("3");
		return JSONResult.ok(service.queryListPage(page, pageSize, user));
	}
	
	@RequestMapping("/saveTransactional")
	public JSONResult saveTransactional(Integer page) throws Exception{
	
		SysUser user = new SysUser();
		String userId = id.nextShort();
		user.setId("1001");
		user.setPassword("891220" + new Date());
		user.setSex("1223");
		user.setUsername("老王" + new Date());
		user.setJob("p");
		service.saveTransactional(user);
		return JSONResult.ok("保存成功");
	}
	@RequestMapping("/queryAll")
	public JSONResult queryAll(Integer page,SysUser user) throws Exception{
		if(page==null) {
			page=1;
		}
	int pageSize = 5;
//		user.s
//		user.setJob("p2");
		return JSONResult.ok(service.queryAll(user,page,pageSize));
	}
}
