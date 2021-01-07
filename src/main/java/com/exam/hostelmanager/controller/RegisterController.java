package com.exam.hostelmanager.controller;

import com.exam.hostelmanager.entity.RoleEntity;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.IUserService;
import com.exam.hostelmanager.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping("hostel")
public class RegisterController {

    @Autowired
    private IUserService userService;
    @Autowired
    private RoleService roleService;

    @PostMapping("registerNow")
    public String registerUserAccount(@ModelAttribute("user") UserEntity entity,
                                      @RequestParam("role") String role) {
        boolean bRole = Boolean.parseBoolean(role);
        RoleEntity roleEntity = bRole ? roleService.findByRoleName("ROLE_USER") :
                roleService.findByRoleName("ROLE_GUEST");

        entity.setRoles(Arrays.asList(roleEntity));

        userService.save(entity, 1);
        return "redirect:/hostel/register?success";
    }

    @ModelAttribute("user")
    public UserEntity userEntity() {
        return new UserEntity();
    }


    @GetMapping("register")
    public String register(Model model) {
        return "register";
    }

    @PostMapping("/checkEmail")
    @ResponseBody
    public String check(@RequestParam String email) {
        return (userService.findUserByEmail(email) != null ? "exist" : "ok");
    }

}
