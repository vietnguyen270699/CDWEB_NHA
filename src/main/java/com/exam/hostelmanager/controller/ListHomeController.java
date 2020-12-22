package com.exam.hostelmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("/hostel")
public class ListHomeController {

	@Autowired
	private PostService postservice;

	@GetMapping("lsHome")
	public ModelAndView homes() {
		return new ModelAndView("gridSidebar");
	}

	@RequestMapping("listPost")
	public String listpost(ModelMap model) {

		List<PostEntity> listpost = (List<PostEntity>) postservice.findAll();

		model.addAttribute("posts", listpost);

		return "gridSidebar";
	}

	@RequestMapping("detailPost/{id}")
	public String detailpost(ModelMap model, @PathVariable(name = "id") Long id) {
		Optional<PostEntity> optionpost = postservice.findById(id);
		if (optionpost.isPresent()) {
			System.out.println(optionpost.get().toString());
			model.addAttribute("post", optionpost.get());
		} else {
			return listpost(model);
		}

		return "propertyDetail";
	}

//	@ResponseBody
//	@GetMapping("/api")
//	public String api(@RequestParam int id) {
//		System.out.println(id);
//		return "ok";
//	}

}
