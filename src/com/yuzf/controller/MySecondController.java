package com.yuzf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yuzf.pojo.User;

@Controller
public class MySecondController {
	
	@RequestMapping("queryUser.do")
	public ModelAndView query() {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		user.setAccount("lebron");
		user.setUserName("james");
		user.setAge(89);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user/user");
		
		return modelAndView;
	}
}
