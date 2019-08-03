package com.cjs.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseMainController {

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("loginProcessUrl","/login");
        return "base-login";
    }
}
