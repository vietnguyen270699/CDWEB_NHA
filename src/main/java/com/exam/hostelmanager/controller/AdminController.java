package com.exam.hostelmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.IUserService;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private PostService postservice;
    @Autowired
    private IUserService userService;

    @GetMapping("home")
    public String loginAdmin() {
        return "admin/adminIndex";
    }

    @GetMapping("adminUser")
    public String loginAdminUser(ModelMap model) {
        List<UserEntity> listUser = (List<UserEntity>) userService.findAll();
        model.addAttribute("users", listUser);
        return "admin/adminUserManager";
    }

    @GetMapping("adminPost")
    public String loginAdminPost(ModelMap model) {
        List<PostEntity> listPost = (List<PostEntity>) postservice.findAll();
        model.addAttribute("posts", listPost);

        return "admin/adminPostManager";
    }

    @GetMapping("adminFeedback")
    public String loginAdminFeeback() {
        return "admin/adminFeedbackManager";
    }

    @GetMapping("adminUser/formAddUser")
    public String loginAdminFormAdd() {
        return "admin/adminFormAdd";
    }

    @GetMapping("adminUser/formEditUser")
    public String loginAdminFormEditUser() {
        return "admin/adminFormEditUser";
    }

    @GetMapping("adminPost/formEditPost")
    public String loginAdminFormEditPost() {
        return "admin/adminFormEditPost";
    }

}
