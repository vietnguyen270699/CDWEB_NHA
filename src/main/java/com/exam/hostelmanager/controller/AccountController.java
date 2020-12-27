package com.exam.hostelmanager.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;

import com.exam.hostelmanager.entity.ImageEntity;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String listpost(ModelMap model, Principal principal) {
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

		// list posted of user
		List<PostEntity> listposted = (List<PostEntity>) postservice.findByUserEntityId(userEntity.getId());
		if (listposted != null) {
			model.addAttribute("posted", listposted);
		}

		return "userProfile";
	}

	@GetMapping("inputCount")
	public ModelAndView inputXu() {
		return new ModelAndView("inputCount");
	}

	@GetMapping("updateUser")
	public String updateUser(Model model) {
		return "updateUser";
	}

	@ModelAttribute("user")
	public UserEntity userDTO() {
		return new UserEntity();
	}

	@PostMapping("updateNow")
	public String updateNow(Principal principal, @ModelAttribute("user") UserEntity userEntity) {
		User user = (User) ((Authentication) principal).getPrincipal();
		UserEntity entity = userService.findUserByEmail(user.getUsername());
		entity.setPhone(userEntity.getPhone());
		entity.setUserName(userEntity.getUserName());
		entity.setPassword(userEntity.getPassword());
		entity.setAddress(userEntity.getAddress());
		userService.save(entity);
		return "redirect:/admin/updateUser?success";
	}

	@GetMapping("newPost")
	public String newPost(Model model) {
		model.addAttribute("post", new PostEntity());
		return "newPost";
	}

	@PostMapping("postNow")
	public String postNow(Principal principal, @ModelAttribute("post") PostEntity postEntity) {
		User user = (User) ((Authentication) principal).getPrincipal();
		UserEntity entity = userService.findUserByEmail(user.getUsername());
		postEntity.setUserEntity(entity);
		ArrayList<ImageEntity> img = new ArrayList<>();
//        img.add(new ImageEntity(1, "abc"));
		postEntity.setImage(img);
		postservice.save(postEntity);
		return "redirect:/admin/newPost?success";
	}

	@ResponseBody
	@RequestMapping("list/deletepostsave/{id}")
	public boolean listdeletepostsave(ModelMap model, @PathVariable("id") Long id) {

		Cookie listsave = cookieservice.read("listsave");

		String iddelete = id.toString();
		String value = id.toString();
		String newvalue = "";
		if (listsave != null) {
			value = listsave.getValue();
			String[] splits = value.split(",");

			if (value.contains(id.toString())) {
				for (String string : splits) {
					if (!string.equalsIgnoreCase(iddelete)) {
						newvalue += "," + string.toString();
					}
				}
			} else {
				return false;
			}
		}
		if (newvalue.length() != 0) {
			newvalue = newvalue.substring(1, newvalue.length());
			cookieservice.create("listsave", newvalue, 30);
		} else {
			cookieservice.delete("listsave");
		}
		return true;
	}
}
