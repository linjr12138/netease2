package com.linjingrong.netease.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linjingrong.netease.pojo.User;
import com.linjingrong.netease.service.UserService;

@Controller
@RequestMapping("")
public class testcontroller {
	
	@Autowired
	UserService userService;
	@RequestMapping("123")
	public String getuser(Model model){
		
		User user = userService.get(1);
		
		model.addAttribute("user",user);
		return "test";
		
	}
	

}
