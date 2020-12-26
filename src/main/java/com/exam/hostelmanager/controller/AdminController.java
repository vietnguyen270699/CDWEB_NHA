package com.exam.hostelmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {

    @GetMapping("home")
    public String loginAdmin() {
        return "adminIndex";
    }
    
    @GetMapping("adminUser")
    public String loginAdminUser() {
        return "adminUserManager";
    }
    
    @GetMapping("adminPost")
    public String loginAdminPost() {
        return "adminPostManager";
    }
    
    @GetMapping("adminFeedback")
    public String loginAdminFeeback() {
        return "adminFeedbackManager";
    }
    
    @GetMapping("adminUser/formAddUser")
    public String loginAdminformAdd() {
        return "adminFormAdd";
    }
    @GetMapping("adminUser/formEditUser")
    public String loginAdminformEditUser() {
        return "adminFormEditUser";
    }
    
    @GetMapping("adminPost/formEditPost")
    public String loginAdminformEditPost() {
        return "adminFormEditPost";
    }

}
