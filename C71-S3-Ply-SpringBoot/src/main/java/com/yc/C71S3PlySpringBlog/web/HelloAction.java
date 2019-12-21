package com.yc.C71S3PlySpringBoot.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HelloAction {
	@GetMapping("hello")
	public String Hello() {
		return "hello world!";
	}
	@GetMapping("/")//默认页面
	public ModelAndView Index(ModelAndView mav) {
		mav.setViewName("index.html");
		return mav;
	}
}
