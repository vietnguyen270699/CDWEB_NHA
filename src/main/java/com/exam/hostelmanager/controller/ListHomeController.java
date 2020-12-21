package com.exam.hostelmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
