package com.yc.C71S3PlySpringBoot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.C71S3PlySpringBoot.bean.Category;

public interface CategoryDao {
	
	@Select("select * from category")
	List<Category> selectAll();
}
