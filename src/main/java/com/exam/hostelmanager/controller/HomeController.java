package com.exam.hostelmanager.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.hostelmanager.entity.PostEntity;

@Controller
@RequestMapping("/hostel")
public class HomeController {
	
	@RequestMapping("tab")
	public String listpostSeachSortDown(ModelMap model) {
		
		return "home";
		}

}
