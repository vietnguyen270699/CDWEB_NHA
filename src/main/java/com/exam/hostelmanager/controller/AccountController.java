package com.exam.hostelmanager.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.Cookie;

import com.exam.hostelmanager.entity.ImageEntity;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.exam.hostelmanager.entity.PostEntity;

@Controller
@RequestMapping("/admin")
public class AccountController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;

    @Autowired
    private FeeService feeService;

    @Autowired
    private CookieService cookieService;

    @RequestMapping("profile")
    public String listPost(ModelMap model, Principal principal) {
        Cookie postSave = cookieService.read("listsave");

        if (postSave != null) {

            String ids = postSave.getValue();
            String[] splits = ids.split(",");
            List<Long> listLong = new ArrayList<Long>();

            for (String item : splits) {
                Long item1 = Long.parseLong(item);
                listLong.add(item1);
            }
            List<PostEntity> listPostSave = (List<PostEntity>) postService.findByIdIn(listLong);
            model.addAttribute("postsave", listPostSave);
        }

        // updateU profile
        User user = (User) ((Authentication) principal).getPrincipal();
        UserEntity userEntity = userService.findByEmail(user.getUsername());
        model.addAttribute("profile", userEntity);

        // list posted of user
        List<PostEntity> listPosted = (List<PostEntity>) postService.findByUserEntityId(userEntity.getId());
        if (listPosted != null) {
            model.addAttribute("posted", listPosted);
        }

        return "userProfile";
    }

    @GetMapping("updateUser")
    public String updateUser() {
        return "updateUser";
    }

    @ModelAttribute("user")
    public UserEntity userDTO() {
        return new UserEntity();
    }

    @PostMapping("updateNow")
    public String updateNow(Principal principal, @ModelAttribute("user") UserEntity userEntity) {
        User user = (User) ((Authentication) principal).getPrincipal();
        UserEntity entity = userService.findByEmail(user.getUsername());
        entity.setPhone(userEntity.getPhone());
        entity.setUserName(userEntity.getUserName());
        entity.setPassword(userEntity.getPassword());
        entity.setAddress(userEntity.getAddress());
        userService.save(entity, 1);
        return "redirect:/updateUser?success";
    }

    @GetMapping("newPost")
    public String newPost(Model model) {
        model.addAttribute("post", new PostEntity());
        return "newPost";
    }

    @PostMapping("/checkCoin")
    @ResponseBody
    public String check(@RequestParam String fee, Principal principal) {
        User user = (User) ((Authentication) principal).getPrincipal();
        UserEntity entity = userService.findByEmail(user.getUsername());

        return (entity.getMoney() < Double.parseDouble(fee) ? "big" : "ok");
    }

    @PostMapping("postNow")
    public String postNow(Principal principal, @ModelAttribute("post") PostEntity postEntity,
                          @RequestParam("photo") MultipartFile photo, @RequestParam("fee") String fee) {
        User user = (User) ((Authentication) principal).getPrincipal();
        UserEntity entity = userService.findByEmail(user.getUsername());
        entity.setMoney(entity.getMoney() - Double.parseDouble(fee));
        userService.save(entity, 0);
        postEntity.setUserEntity(entity);

        Path path = Paths.get("uploads/");
        try {
            InputStream inputStream = photo.getInputStream();
            Files.copy(inputStream, path.resolve(photo.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);

            ImageEntity imageEntity = new ImageEntity(photo.getOriginalFilename().toUpperCase(Locale.ROOT));
            imageEntity.setPost_id(postEntity);
            postEntity.setImage(Arrays.asList(imageEntity));

        } catch (IOException e) {
            e.printStackTrace();
        }
        postEntity.setFeeEntity(feeService.findByFee(Double.parseDouble(fee)));

        postService.save(postEntity);
        return "redirect:/admin/newPost?success";
    }


  


}
