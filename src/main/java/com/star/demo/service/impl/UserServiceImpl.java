package com.star.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.demo.mapper.SysUserMapper;
import com.star.demo.pojo.SysUser;
import com.star.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private SysUserMapper userMapper;



	@Override
	public void saveUser(SysUser user) throws Exception {
	
		userMapper.insert(user);
	
	}

	@Override
	public void updateUser(SysUser user) {
		
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void deleteUser(int userId) {
		
		userMapper.deleteByPrimaryKey(userId);
		
	}

	@Override
	public SysUser queryUserById(int userId) {
		
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<SysUser> queryUserList(SysUser user) {
		
		return userMapper.select(user);
	}

}
