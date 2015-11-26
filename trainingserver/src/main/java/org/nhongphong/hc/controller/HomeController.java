package org.nhongphong.hc.controller;

import org.nhongphong.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@RequestMapping(value="/" , method = RequestMethod.GET)
	@ResponseBody
	public String home(){
		return "Server is runing......";
	}
}
