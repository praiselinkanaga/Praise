package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController 
{
    @RequestMapping("/")
    public String getLanding()
    {
    	return"index";
    }
}
