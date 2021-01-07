package com.exam.hostelmanager.controller;

import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/hostel")
public class LoginController {

    @Autowired
    IUserService userService;

    @GetMapping("login")
    public ModelAndView login() {
        return new ModelAndView("loginUser");
    }


    @GetMapping("loginNow")
    public String loginNow() {
        return "user/home";
    }


    @ModelAttribute("loginUser")
    public UserEntity userEntity() {
        return new UserEntity();
    }


    @GetMapping("forgotPassword")
    public ModelAndView forgotPassword() {
        return new ModelAndView("user/forgotPassword");
    }


    @GetMapping("logout")
    public String logout() {
        return "user/home";
    }

    @GetMapping("logoutSuccess")
    public String logoutSuccess() {
        return "user/home";
    }


}
