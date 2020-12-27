package com.exam.hostelmanager.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;

import com.exam.hostelmanager.dto.UserDTO;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.service.CookieService;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("/admin")
public class AccountController {
	Double pricefee = 299.0;

	@Autowired
	private PostService postservice;
	@Autowired
	private IUserService userService;

	@Autowired
	private CookieService cookieservice;

	@RequestMapping("profile")
	public String listpost(ModelMap model, Principal principal ) {
		Cookie postsave = cookieservice.read("listsave");

		if (postsave != null) {

			String ids = postsave.getValue();
			String[] splits = ids.split(",");
			List<Long> listlong = new ArrayList<Long>();

			for (String item : splits) {
				Long item1 = Long.parseLong(item);
				listlong.add(item1);
			}
			List<PostEntity> listpostsave = (List<PostEntity>) postservice.findByIdIn(listlong);
			model.addAttribute("postsave", listpostsave);
		}

		// updateU profile
		User user = (User) ((Authentication) principal).getPrincipal();

		UserEntity userEntity = userService.findUserByEmail(user.getUsername());
		model.addAttribute("profile", userEntity);
		
		
		return "userProfile";
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
	public String updateUser(Model model) {
		return "updateUser";
	}

	@PostMapping("updateNow")
	public String updateNow(Model model, Principal principal) {

		User user = (User) ((Authentication) principal).getPrincipal();
		UserEntity entity = userService.findUserByEmail(user.getUsername());
		entity.setPhone(012233333333);
		userService.save(entity);
		return "redirect:/admin/updateUser?success";
	}



}
