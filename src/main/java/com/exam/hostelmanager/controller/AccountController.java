package com.exam.hostelmanager.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;

import com.exam.hostelmanager.entity.ImageEntity;
import com.exam.hostelmanager.entity.OrderPayPal;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.IUserService;
import com.exam.hostelmanager.service.PayPalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.exam.hostelmanager.entity.PostEntity;
import com.exam.hostelmanager.service.CookieService;
import com.exam.hostelmanager.service.PostService;

@Controller
@RequestMapping("/admin")
public class AccountController {
//
//    public static final String SUCCESS_URL = "admin/pay/success";
//    public static final String CANCEL_URL = "admin/pay/cancel";

    Double pricefee = 299.0;
//    @Autowired
//    private PayPalService service;

    @Autowired
    private PostService postService;
    @Autowired
    private IUserService userService;

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
        UserEntity userEntity = userService.findUserByEmail(user.getUsername());
        model.addAttribute("profile", userEntity);

        // list posted of user
        List<PostEntity> listposted = (List<PostEntity>) postService.findByUserEntityId(userEntity.getId());
        if (listposted != null) {
            model.addAttribute("posted", listposted);
        }

        return "userProfile";
    }


    //update user

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


    //new post
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
        postService.save(postEntity);
        return "redirect:/admin/newPost?success";
    }


    //paypal
//    @GetMapping("/paypal")
//    public String homePayPal() {
//        return "paypalHome";
//
//    }

//    @PostMapping("/pay")
//    public String payment(@ModelAttribute("order") OrderPayPal order) {
//        try {
//            Payment payment = service.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
//                    order.getIntent(), order.getDescription(), "http://localhost:8080/" + CANCEL_URL,
//                    "http://localhost:8080/" + SUCCESS_URL);
//            for (Links link : payment.getLinks()) {
//                if (link.getRel().equals("approval_url")) {
//                    return "redirect:" + link.getHref();
//                }
//            }
//
//        } catch (PayPalRESTException e) {
//
//            e.printStackTrace();
//        }
//        return "redirect:/paypal";
//    }


//    @PostMapping(value = CANCEL_URL)
//    public String cancel() {
//        return "cancelPayPal";
//    }

//    @PostMapping(value = SUCCESS_URL)
//    public String successPay(@RequestParam("paymentId") String paymentId,
//                             @RequestParam("PayerID") String payerId,
//                             Principal principal, @ModelAttribute("user") UserEntity userEntity,
//                             @ModelAttribute("order") OrderPayPal order) {
//
//        try {
//            User user = (User) ((Authentication) principal).getPrincipal();
//            UserEntity entity = userService.findUserByEmail(user.getUsername());
//
//            Payment payment = service.executePayment(paymentId, payerId);
//            System.out.println("GET JSONNNNNNNNNNNN   \n" + payment.toJSON());
//            if (payment.getState().equals("approved")) {
//                entity.setMoney(entity.getMoney() + order.getPrice());
//
//                userService.save(entity);
//                System.out.println("PRICE: PRICE PRICE PRICE PRICE \n" + entity.getMoney());
//                return "successPayPal";
//            }
//
//        } catch (PayPalRESTException exception) {
//            System.out.println(exception.getMessage());
//        }
//
//        return "redirect:/paypal";
//    }

    //delete account
    @ResponseBody
    @RequestMapping("list/deletepostsave/{id}")
    public boolean listDeletePostSave(ModelMap model, @PathVariable("id") Long id) {

        Cookie listSave = cookieService.read("listsave");

        String idDelete = id.toString();
        String value = id.toString();
        String newValue = "";
        if (listSave != null) {
            value = listSave.getValue();
            String[] splits = value.split(",");

            if (value.contains(id.toString())) {
                for (String string : splits) {
                    if (!string.equalsIgnoreCase(idDelete)) {
                        newValue += "," + string.toString();
                    }
                }
            } else {
                return false;
            }
        }
        if (newValue.length() != 0) {
            newValue = newValue.substring(1, newValue.length());
            cookieService.create("listsave", newValue, 30);
        } else {
            cookieService.delete("listsave");
        }
        return true;
    }


}
