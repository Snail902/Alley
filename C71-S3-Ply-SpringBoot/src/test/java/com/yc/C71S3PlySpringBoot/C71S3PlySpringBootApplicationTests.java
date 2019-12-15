package com.yc.C71S3PlySpringBoot;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.yc.C71S3PlySpringBoot.bean.Category;
import com.yc.C71S3PlySpringBoot.bean.UserBean;
import com.yc.C71S3PlySpringBoot.dao.CategoryDao;
import com.yc.C71S3PlySpringBoot.dao.UserMapper;

@SpringBootTest
class C71S3PlySpringBootApplicationTests {
	@Resource
	private CategoryDao cdao;
	
	@Resource
	private UserMapper um;
	@Test
	void contextLoads() {
		List<Category> list = cdao.selectAll();
		System.out.println(list);
	}
	@Test
	void contextLoadsu() {
		List<UserBean> list = um.selectExample();
		System.out.println(list);
	}
}
