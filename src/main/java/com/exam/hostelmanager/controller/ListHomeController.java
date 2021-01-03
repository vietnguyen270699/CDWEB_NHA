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

import com.exam.hostelmanager.entity.ImageEntity;
import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.service.CookieService;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("/hostel")
public class ListHomeController {
	String cityMode = null;
	Double priceMode = (double) 0;
	Double acreageMode = null;
	@Autowired
	CookieService cookieService;

	@Autowired
	private PostService postService;
	
	
	@GetMapping("lsHome")
	public ModelAndView homes() {
		return new ModelAndView("listHome");
	}

	@RequestMapping("listPost")
	public String listpost(ModelMap model) {

		List<PostEntity> listpost = (List<PostEntity>) postService.findAll();
		model.addAttribute("posts", listpost);

		return "listHome";
	}

	@RequestMapping("detailPost/{id}")
	public String detailPost(ModelMap model, @PathVariable(name = "id") Long id) {
		Optional<PostEntity> optionpost = postService.findById(id);
		if (optionpost.isPresent()) {
			String city = optionpost.get().getContent().getCity();
			List<PostEntity> listsuggestions = (List<PostEntity>) postService.findByContentCity(city);
			
			List<ImageEntity> images = optionpost.get().getImage();
			
			model.addAttribute("listsuggestions", listsuggestions);
			model.addAttribute("images", images);
			model.addAttribute("post", optionpost.get());
				
		} else {
			return listpost(model);
		}

		return "propertyDetail";
	}

	@RequestMapping("Search")
	public String listpostSeach(ModelMap model, @RequestParam(defaultValue = "") String city,
			@RequestParam(defaultValue = "") Double acreage, @RequestParam(defaultValue = "") Double price) {
		cityMode = city;
		acreageMode = acreage;
		priceMode = price;

		if (acreage < 70 && price < 4000000) {
			List<PostEntity> listpost = (List<PostEntity>) postService
					.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqual(city, acreage, price);

			model.addAttribute("posts", listpost);
		} else if (acreage > 70 && price < 4000000) {
			List<PostEntity> listpost = (List<PostEntity>) postService
					.findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceLessThanEqual(city, acreage,
							price);

			model.addAttribute("posts", listpost);
		} else if (acreage < 70 && price > 4000000) {
			List<PostEntity> listPost = (List<PostEntity>) postService
					.findByContentCityAndContentAcreageLessThanEqualAndContentPriceGreaterThanEqual(city, acreage,
							price);

			model.addAttribute("posts", listPost);
		} else if (acreage > 70 && price > 4000000) {
			List<PostEntity> listPost = (List<PostEntity>) postService
					.findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceGreaterThanEqual(city, acreage,
							price);

			model.addAttribute("posts", listPost);
		}
		return "listHome";
	}

	@RequestMapping("Search/sortUp")
	public String listpostSeachSortUp(ModelMap model) {
		if (priceMode != 0) {
			List<PostEntity> listPostSort = (List<PostEntity>) postService
					.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceAsc(
							cityMode, acreageMode, priceMode);

			model.addAttribute("posts", listPostSort);
		} else {
			List<PostEntity> listPostSort = (List<PostEntity>) postService
					.findByContentPriceGreaterThanEqualOrderByContentPriceAsc(priceMode);

			model.addAttribute("posts", listPostSort);
		}
		return "listHome";
	}

	@RequestMapping("Search/sortDown")
	public String listpostSeachSortDown(ModelMap model) {
		if (priceMode != 0) {
			List<PostEntity> listpostsort = (List<PostEntity>) postService
					.findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceDesc(
							cityMode, acreageMode, priceMode);

			model.addAttribute("posts", listpostsort);
		} else {
			List<PostEntity> listpostsort = (List<PostEntity>) postService
					.findByContentPriceGreaterThanEqualOrderByContentPriceDesc(priceMode);

			model.addAttribute("posts", listpostsort);
		}
		return "listHome";
	}

	@ResponseBody
	@RequestMapping("list/postsave/{id}")
	public boolean listpostsave(ModelMap model, @PathVariable("id") Long id) {

		Cookie listsave = cookieService.read("listsave");
		String value = id.toString();
		if (listsave != null) {
			value = listsave.getValue();
			if (!value.contains(id.toString())) {
				value += "," + id.toString();
			} else {
				return false;
			}
		}
		cookieService.create("listsave", value, 30);
				return true;
	}


}
