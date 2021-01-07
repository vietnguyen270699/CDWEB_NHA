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
    public String homes() {
        return "user/listHome";
    }

    @RequestMapping("listPost")
    public String listPost(ModelMap model) {

        List<PostEntity> listPost = (List<PostEntity>) postService.findAll();
        model.addAttribute("posts", listPost);

        return "user/listHome";
    }

    @RequestMapping("detailPost/{id}")
    public String detailPost(ModelMap model, @PathVariable(name = "id") Long id) {
        Optional<PostEntity> optionPost = postService.findById(id);
        if (optionPost.isPresent()) {
            String city = optionPost.get().getContent().getCity();
            List<PostEntity> listSuggestions = (List<PostEntity>) postService.findByContentCity(city);

            List<ImageEntity> images = optionPost.get().getImage();

            model.addAttribute("listsuggestions", listSuggestions);
            model.addAttribute("images", images);
            model.addAttribute("post", optionPost.get());

        } else {
            return listPost(model);
        }

        return "user/propertyDetail";
    }

    @RequestMapping("Search")
    public String listPostSearch(ModelMap model, @RequestParam(defaultValue = "") String city,
                                 @RequestParam(defaultValue = "") Double acreage, @RequestParam(defaultValue = "") Double price) {
        cityMode = city;
        acreageMode = acreage;
        priceMode = price;

        if (acreage < 70 && price < 4000000) {
            List<PostEntity> listPost = (List<PostEntity>) postService
                    .findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqual(city, acreage, price);

            model.addAttribute("posts", listPost);
        } else if (acreage > 70 && price < 4000000) {
            List<PostEntity> listPost = (List<PostEntity>) postService
                    .findByContentCityAndContentAcreageGreaterThanEqualAndContentPriceLessThanEqual(city, acreage,
                            price);

            model.addAttribute("posts", listPost);
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
        return "user/listHome";
    }

    @RequestMapping("Search/sortUp")
    public String listPostSeachSortUp(ModelMap model) {
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
        return "user/listHome";
    }

    @RequestMapping("Search/sortDown")
    public String listPostSeachSortDown(ModelMap model) {
        if (priceMode != 0) {
            List<PostEntity> listPostSort = (List<PostEntity>) postService
                    .findByContentCityAndContentAcreageLessThanEqualAndContentPriceLessThanEqualOrderByContentPriceDesc(
                            cityMode, acreageMode, priceMode);

            model.addAttribute("posts", listPostSort);
        } else {
            List<PostEntity> listPostSort = (List<PostEntity>) postService
                    .findByContentPriceGreaterThanEqualOrderByContentPriceDesc(priceMode);

            model.addAttribute("posts", listPostSort);
        }
        return "user/listHome";
    }

    @ResponseBody
    @RequestMapping("list/postsave/{id}")
    public boolean listPostSave(ModelMap model, @PathVariable("id") Long id) {

        Cookie listSave = cookieService.read("listsave");
        String value = id.toString();
        if (listSave != null) {
            value = listSave.getValue();
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
