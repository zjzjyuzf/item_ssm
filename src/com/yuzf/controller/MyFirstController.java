package com.yuzf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yuzf.pojo.User;

/**
 * 每个handler都要实现Controller接口
 * @author Administrator
 *
 */
public class MyFirstController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		user.setAccount("lebron");
		user.setUserName("james");
		user.setAge(89);
		modelAndView.addObject("user", user);
//		modelAndView.setViewName("user/user");
		modelAndView.setViewName("/WEB-INF/jsp/user/user.jsp");
		return modelAndView;
	}

}
