package com.yc.C71S3PlySpringBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.C71S3PlySpringBoot.dao")
public class C71S3PlySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(C71S3PlySpringBootApplication.class, args);
	}

}
