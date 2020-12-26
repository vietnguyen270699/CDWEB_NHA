package com.exam.hostelmanager.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.Cookie;

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
import com.exam.hostelmanager.service.CookieService;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("/hostel")
public class ListHomeController {
	String citymode = null;
	Double pricemode = (double) 0;
	Double acreagemode = null;
	@Autowired
	CookieService cookieservice;

	@Autowired
	private PostService postservice;

	@GetMapping("lsHome")
	public ModelAndView homes() {
		return new ModelAndView("listHome");
	}

	@RequestMapping("listPost")
	public String listpost(ModelMap model) {

		List<PostEntity> listpost = (List<PostEntity>) postservice.findAll();

		model.addAttribute("posts", listpost);

		return "listHome";
	}

	@RequestMapping("detailPost/{id}")
	public String detailpost(ModelMap model, @PathVariable(name = "id") Long id) {
		Optional<PostEntity> optionpost = postservice.findById(id);
		if (optionpost.isPresent()) {
			model.addAttribute("post", optionpost.get());
		} else {
			return listpost(model);
		}

		return "propertyDetail";
	}

	@RequestMapping("Search")
	public String listpostSeach(ModelMap model, @RequestParam(defaultValue = "") String city,
			@RequestParam(defaultValue = "") Double acreage, @RequestParam(defaultValue = "") Double price) {
		citymode = city;
		acreagemode = acreage;
		pricemode = price;

		if (acreage < 70 && price < 4000000) {
			List<PostEntity> listpost = (List<PostEntity>) postservice
					.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqual(city, acreage, price);

			model.addAttribute("posts", listpost);
		} else if (acreage > 70 && price < 4000000) {
			List<PostEntity> listpost = (List<PostEntity>) postservice
					.findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceLessThanEqual(city, acreage,
							price);

			model.addAttribute("posts", listpost);
		} else if (acreage < 70 && price > 4000000) {
			List<PostEntity> listpost = (List<PostEntity>) postservice
					.findByContentCityAndContentAcreageLessThanEqualAndContentPriceGreaterThanEqual(city, acreage,
							price);

			model.addAttribute("posts", listpost);
		} else if (acreage > 70 && price > 4000000) {
			List<PostEntity> listpost = (List<PostEntity>) postservice
					.findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceGreaterThanEqual(city, acreage,
							price);

			model.addAttribute("posts", listpost);
		}
		return "listHome";
	}

	@RequestMapping("Search/sortUp")
	public String listpostSeachSortUp(ModelMap model) {
		if (pricemode != 0) {
			List<PostEntity> listpostsort = (List<PostEntity>) postservice
					.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceAsc(
							citymode, acreagemode, pricemode);

			model.addAttribute("posts", listpostsort);
		} else {
			List<PostEntity> listpostsort = (List<PostEntity>) postservice
					.findByContentPriceGreaterThanEqualOrderByContentPriceAsc(pricemode);

			model.addAttribute("posts", listpostsort);
		}
		return "listHome";
	}

	@RequestMapping("Search/sortDown")
	public String listpostSeachSortDown(ModelMap model) {
		if (pricemode != 0) {
			List<PostEntity> listpostsort = (List<PostEntity>) postservice
					.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceDesc(
							citymode, acreagemode, pricemode);

			model.addAttribute("posts", listpostsort);
		} else {
			List<PostEntity> listpostsort = (List<PostEntity>) postservice
					.findByContentPriceGreaterThanEqualOrderByContentPriceDesc(pricemode);

			model.addAttribute("posts", listpostsort);
		}
		return "listHome";
	}

	@ResponseBody
	@RequestMapping("list/postsave/{id}")
	public boolean listpostsave(ModelMap model, @PathVariable("id") Long id) {

		Cookie listsave = cookieservice.read("listsave");
		String value = id.toString();
		if (listsave != null) {
			value = listsave.getValue();
			if (!value.contains(id.toString())) {
				value += "," + id.toString();
			} else {
				return false;
			}
		}
		cookieservice.create("listsave", value, 30);
				return true;
	}
//	@ResponseBody
//	@GetMapping("/api")
//	public String api(@RequestParam int id) {
//		System.out.println(id);
//		return "ok";
//	}

}
