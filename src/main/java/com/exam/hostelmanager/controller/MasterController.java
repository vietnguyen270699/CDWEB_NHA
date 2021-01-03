package com.exam.hostelmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("/hostel")
public class MasterController {
	Double priceFee = 299.0;
	String ktx = "Ký túc xá";
	String hostel = "Nhà trọ";
	@Autowired
	private PostService postservice;

	@GetMapping("home")
	public String loadHome(ModelMap model) {

		List<PostEntity> listpost = (List<PostEntity>) postservice
				.findByFeeEntityPriceGreaterThanOrderByFeeEntityPriceDesc(priceFee);

		List<PostEntity> listhostel = (List<PostEntity>) postservice
				.findByTitleOrderByFeeEntityPriceDesc(hostel);
		
		List<PostEntity> listktx = (List<PostEntity>) postservice
				.findByTitleOrderByFeeEntityPriceDesc(ktx);
		
		model.addAttribute("posts", listpost);
		model.addAttribute("hostels", listhostel);
		model.addAttribute("ktxs", listktx);
		return "home";
	}

	@GetMapping("error404")
	public String showError404() {
		return "page404";
	}
}
