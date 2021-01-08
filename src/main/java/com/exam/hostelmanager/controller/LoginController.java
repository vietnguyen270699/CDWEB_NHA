package com.exam.hostelmanager.controller;

import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller

@RequestMapping("/hostel")
public class LoginController {

    @Autowired
    IUserService userService;

    @GetMapping("login")
    public ModelAndView login() {
        return new ModelAndView("loginUser");
    }


    @GetMapping("loginNow")
    public String loginNow() {
        return "home";
    }


    @ModelAttribute("loginUser")
    public UserEntity userEntity() {
        return new UserEntity();
    }


    @GetMapping("forgotPassword")
    public ModelAndView forgotPassword() {
        return new ModelAndView("forgotPassword");
    }


    @GetMapping("logout")
    public String logout() {
        return "home";
    }

    @GetMapping("logoutSuccess")
    public String logoutSuccess() {
        return "home";
    }


//    //reset pass
//    @PostMapping("/user/resetPassword")
//    public GenericResponse resetPassword(HttpServletRequest request,
//                                         @RequestParam("email") String userEmail) {
//        UserEntity user = userService.findUserByEmail(userEmail);
//        if (user == null) {
//            throw new UserNotFoundException();
//        }
//        String token = UUID.randomUUID().toString();
//        userService.createPasswordResetTokenForUser(user, token);
//        mailSender.send(constructResetTokenEmail(getAppUrl(request),
//                request.getLocale(), token, user));
//        return new GenericResponse(
//                messages.getMessage("message.resetPasswordEmail", null,
//                        request.getLocale()));
//    }

}
