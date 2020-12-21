package com.exam.hostelmanager.controller;

import com.exam.hostelmanager.dto.UserDTO;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/hostel")
public class LoginController {


    @GetMapping("login")
    public ModelAndView login() {
        return new ModelAndView("loginUser");
    }


    @PostMapping("loginNow")
    public String loginNow() {
        return "home";
    }


    @GetMapping("forgotPassword")
    public ModelAndView fogotPassword() {
        return new ModelAndView("forgotPassword");
    }


    @PostMapping("logout")
    public String logout() {
        return "home";
    }

@PostMapping("logoutSuccess")
    public String logoutSuccess() {
        return "home";
    }



}
