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

    private IUserService userService;

    public LoginController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("registerNow")
    public String registerUserAccount(@ModelAttribute("user")UserDTO dto){
        userService.save(dto);
        return "redirect:/hostel/register?success";
    }

    // **
    @ModelAttribute("user")
    public UserDTO userDTO(){
        return new UserDTO();
    }

    @GetMapping("login")
    public ModelAndView login() {
        return new ModelAndView("loginUser");
    }


    @GetMapping("register")
    public String register(Model model) {
//        model.addAttribute("user", new UserDTO());     ==> thay bang donh tren **
        return "register";
    }

    @GetMapping("forgotPassword")
    public ModelAndView fogotPassword() {
        return new ModelAndView("forgotPassword");
    }
}
