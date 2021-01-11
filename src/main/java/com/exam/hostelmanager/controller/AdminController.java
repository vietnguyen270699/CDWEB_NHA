package com.exam.hostelmanager.controller;

import java.util.Arrays;
import java.util.List;

import com.exam.hostelmanager.entity.RoleEntity;
import com.exam.hostelmanager.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.UserService;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private PostService postservice;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

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
    public String loginAdminFeedback() {
        return "admin/adminFeedbackManager";
    }

    @GetMapping("adminUser/formAddUser")
    public String loginAdminFormAdd() {
        return "admin/adminFormAdd";
    }

    @ModelAttribute("user")
    public UserEntity userEntity() {
        return new UserEntity();
    }


    @PostMapping("adminUser/formAddUser")
    public String addUserNow(@ModelAttribute("user") UserEntity entity) {
        RoleEntity roleEntity = roleService.findByRoleName("ROLE_ADMIN");
        entity.setRoles(Arrays.asList(roleEntity));
        userService.save(entity, 1);

        return "redirect:/admin/adminUser/formAddUser?success";
    }

    @GetMapping("adminUser/formEditUser")
    public String loginAdminFormEditUser() {
        return "admin/adminFormEditUser";
    }

    @GetMapping("adminPost/formEditPost")
    public String loginAdminFormEditPost() {
        return "admin/adminFormEditPost";
    }


    @PostMapping("/checkEmail")
    @ResponseBody
    public String check(@RequestParam String email) {
        return (userService.findByEmail(email) != null ? "exist" : "ok");
    }

}
