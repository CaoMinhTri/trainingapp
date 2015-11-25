package com.tma.ov.nhongphong.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tma.ov.nhongphong.ts.service.UserService;


@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	@RequestMapping(value="/" , method = RequestMethod.GET)
	@ResponseBody
	public String home(){
		return "Server is runing......" + userService.getUserByUserName("nhongphong").toString();
	}
}
