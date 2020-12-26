package com.exam.hostelmanager.controller;

import java.util.List;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	private CookieService cookieservice;
//    @GetMapping("profile")
//    public ModelAndView profile() {
//        return new ModelAndView("userProfile");
//    }

	@RequestMapping("profile")
	public String listpost(ModelMap model) {
		List<PostEntity> listpostsave = (List<PostEntity>) postservice
				.findByFeeEntityPriceGreaterThanOrderByFeeEntityPriceDesc(pricefee);
		model.addAttribute("postsave", listpostsave);
//		Cookie postsave = cookieservice.read("listsave");
//		String ids = postsave.getValue();
//		if (postsave != null) {
//			List<PostEntity> listpostsave = (List<PostEntity>) postservice.findByIdIn(ids);
//
//			model.addAttribute("postsave", listpostsave);
//		}

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
	public ModelAndView updateUser() {
		return new ModelAndView("updateUser");
	}

}
