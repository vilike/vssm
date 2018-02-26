package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myTestController")
public class MyTestController {
	
	@RequestMapping(params="mytest")
	public String myTest(HttpServletRequest request) {
		return "index";
	}
}
