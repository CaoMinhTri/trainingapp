package org.nhongphong.hc.controller;

import org.nhongphong.hc.model.User;
import org.nhongphong.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "Server is runing......\n";
	}
	@RequestMapping(value="/user/{type}" , method = RequestMethod.GET)
	@ResponseBody
	public String crudUSER(@PathVariable String type)
	{
		User u = new User();
		switch (type) {
		case "create":
			
			break;
		case "update":
					
					u.setUsername("nhongphong");
					u.setPassword("password_update");
					u = userService.update(u);
					break;
		case "read":
			
			break;
		case "delete":
	
			break;
		}
		
		return u.toString();
	}
}
