package com.exam.hostelmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AccountController {

    @GetMapping("profile")
    public ModelAndView profile() {
        return new ModelAndView("userProfile");
    }

    @GetMapping("newPost")
    public ModelAndView newPost() {
        return new ModelAndView("newPost");
    }
    
    @GetMapping("inputCount")
    public ModelAndView inputXu() {
        return new ModelAndView("inputCount");
    }
    
    @GetMapping("updateUser")
    public ModelAndView updateUser() {
        return new ModelAndView("updateUser");
    }

}
