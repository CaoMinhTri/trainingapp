package org.nhongphong.hc.controller;

import org.nhongphong.hc.model.User;
import org.nhongphong.hc.service.UserService;
import org.nhongphong.hc.util.RequestType;
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
		User u = new User();
		u.setUsername("administrator");
		u.setPassword("12345");
		userService.crud(u, RequestType.REQUEST_CREATE);
		return "Server is runing......";
	}
}
