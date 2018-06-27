package com.star.demo.service;

import java.util.List;

import com.star.demo.pojo.SysUser;

public interface UserService {

	public void saveUser(SysUser user) throws Exception;

	public void updateUser(SysUser user);

	public void deleteUser(int userId);

	public SysUser queryUserById(int userId);

	public List<SysUser> queryUserList(SysUser user);
}
