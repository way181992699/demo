package com.star.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.star.demo.mapper.SysUserMapper;
import com.star.demo.mapper.SysUserMapperCustom;
import com.star.demo.pojo.SysUser;
import com.star.demo.service.UserService;

import tk.mybatis.mapper.entity.Example;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private SysUserMapper userMapper;
	
	@Autowired
	private SysUserMapperCustom userMapperCustom;

	@Override
	public void saveUser(SysUser user) throws Exception {
	System.out.println(user.getId());
		userMapper.insert(user);
	
	}

	@Override
	public void updateUser(SysUser user) {
//		userMapper.updateByPrimaryKey(user); 此方法会把没有填写修改的字段 默认设置为null；
		userMapper.updateByPrimaryKeySelective(user); 
	}

	@Override
	public void deleteUser(String userId) {
		
		userMapper.deleteByPrimaryKey(userId);
		
	}

	@Override
	public SysUser queryUserById(String userId) {
		
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<SysUser> queryUserList(SysUser user) {
		
		return userMapper.select(user);
	}

	@Override
	public List<SysUser> queryListPage(Integer page, Integer pageSize, SysUser user) throws Exception {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pageSize);
		Example example = new Example(SysUser.class);
		example.orderBy("age").asc();
		return userMapper.selectByExample(example);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveTransactional(SysUser user) throws Exception {
		// TODO Auto-generated method stub
		userMapper.insert(user);
		int a =1 / 0;
		user.setAge(77);
		userMapper.updateByPrimaryKeySelective(user);
	}

	
	@Override
	public List<SysUser> queryAll(SysUser user, Integer page, Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pageSize);
		 		return userMapperCustom.queryAll(user);
		 		
	}

}
