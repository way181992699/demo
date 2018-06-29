package com.star.demo.mapper;

import java.util.List;

import com.star.demo.pojo.SysUser;
import com.star.demo.utils.MyMapper;

public interface SysUserMapperCustom extends MyMapper<SysUser> {
	public List<SysUser> queryAll(SysUser user);
	
}