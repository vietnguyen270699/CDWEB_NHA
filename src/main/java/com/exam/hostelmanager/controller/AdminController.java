package com.exam.hostelmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.repository.UserRepository;
import com.exam.hostelmanager.service.IUserService;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private PostService postservice;
	@Autowired
	private IUserService userservice;
	
	@GetMapping("home")
	public String loginAdmin() {
		return "adminIndex";
	}

	@GetMapping("adminUser")
	public String loginAdminUser(ModelMap model) {
		List<UserEntity> listuser = (List<UserEntity>) userservice.findAll();
		model.addAttribute("users", listuser);
		return "adminUserManager";
	}

	@GetMapping("adminPost")
	public String loginAdminPost(ModelMap model) {
		List<PostEntity> listpost = (List<PostEntity>) postservice.findAll();
		model.addAttribute("posts", listpost);
	
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
