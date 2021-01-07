package com.exam.hostelmanager.controller;

import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("hostel")
public class RegisterController {

    private IUserService userService;

    public RegisterController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("registerNow")
    public String registerUserAccount(@ModelAttribute("user") UserEntity entity) {
        userService.save(entity, 1);
        return "redirect:/hostel/register?success";
    }

    @ModelAttribute("user")
    public UserEntity userEntity() {
        return new UserEntity();
    }


    @GetMapping("register")
    public String register(Model model) {
        return "user/register";
    }

    @PostMapping("/checkEmail")
    @ResponseBody
    public String check(@RequestParam String email) {
        return (userService.findUserByEmail(email) != null ? "exist" : "ok");
    }

}
