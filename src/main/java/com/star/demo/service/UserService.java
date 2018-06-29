package com.star.demo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.star.demo.pojo.SysUser;

public interface UserService {

	public void saveUser(SysUser user) throws Exception;

	public void updateUser(SysUser user);

	public void deleteUser(String userId);

	public SysUser queryUserById(String userId);

	public List<SysUser> queryUserList(SysUser user);
	
	public List<SysUser> queryListPage(Integer page,Integer pageSize,SysUser user) throws Exception;
	public void	saveTransactional(SysUser user) throws Exception;
	public List<SysUser> queryAll(SysUser user,Integer page,Integer pageSize) throws Exception;
	
}
