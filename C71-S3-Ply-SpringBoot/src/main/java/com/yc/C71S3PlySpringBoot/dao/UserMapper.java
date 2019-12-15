package com.yc.C71S3PlySpringBoot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.C71S3PlySpringBoot.bean.UserBean;

public interface UserMapper {
	
	@Select("select * from user")
	List<UserBean> selectExample();
}
