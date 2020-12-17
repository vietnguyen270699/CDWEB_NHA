package com.exam.hostelmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hostel")
public class AccountController {

    @GetMapping("profile")
    public ModelAndView frofile() {
        return new ModelAndView("agentprofile");
    }

    @GetMapping("newPost")
    public ModelAndView newPost() {
        return new ModelAndView("newPost");
    }
    
    @GetMapping("inputXu")
    public ModelAndView inputXu() {
        return new ModelAndView("inputXu");
    }
    
    @GetMapping("updateUser")
    public ModelAndView updateUser() {
        return new ModelAndView("updateUser");
    }

}
