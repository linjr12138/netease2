package com.linjingrong.netease.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PageConttoller {
	
	@RequestMapping("loginPage")
    public String loginPage() {
        return "fore/login";
    }
	
    @RequestMapping("forealipay")
    public String alipay(){
        return "fore/alipay";
    }

}
