package com.cjs.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping(value = "/login",method ={ RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String login(){
        return "login success";
    }

    @RequestMapping(value = "/success",method ={ RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String success(){
        return "success";
    }
}
