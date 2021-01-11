package com.exam.hostelmanager.controller;

import com.exam.hostelmanager.dto.Utility;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.UserService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller

@RequestMapping("/hostel")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private JavaMailSender mailSender;

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
    public String forgotPassword() {
        return "forgotPassword";
    }


    @GetMapping("logout")
    public String logout() {
        return "home";
    }

    @GetMapping("logoutSuccess")
    public String logoutSuccess() {
        return "home";
    }

    @PostMapping("forgotPassword")
    public String processForgotPassForm(HttpServletRequest request, Model model) {
        String email = request.getParameter("email");
        String token = RandomString.make(45);
        System.out.println("email:  " + email + "\n token: " + token);

        try {
            userService.updateResetPasswordToken(token, email);
            String resetPasswordLink = Utility.getSiteURL(request) + "/hostel/resetPassword?token=" + token;
            sendMail(email, resetPasswordLink);
            model.addAttribute("mess",
                    "We have sent a reset password link to your email. Please check");

        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "forgotPassword";
    }

    private void sendMail(String email, String resetPasswordLink) throws UnsupportedEncodingException, MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setFrom("contact@gmail.com", "NHA SUPPORT");
        helper.setTo(email);
        String subject = "Here's the link to reset your password";
        String content = "<p> Hello, </p>"
                + "<p>You have requested to reset your password. </p>" +
                "<p>Click the link below to change your password</p>" +
                " <p><a href=\"" + resetPasswordLink + "\">Change my password</a> </p>" +
                "Ignore this mail if you do remember your password, or you havenot made the request.";

        helper.setSubject(subject);
        helper.setText(content, true);
        mailSender.send(message);

    }

    @GetMapping("/resetPassword")
    public String showResetPassword(@Param(value = "token") String token, Model model) {

        UserEntity userEntity = userService.getByResetPasswordToken(token);
        if (userEntity == null) {
            model.addAttribute("title", "Reset your password");
            model.addAttribute("mess", "Invalid Token");
            return "mess";
        }
        model.addAttribute("token", token);

        return "resetPasswordForm";
    }

    @PostMapping("/resetPassword")
    public String processResetPassword(HttpServletRequest request, Model model) {
        String token = request.getParameter("token");
        String password = request.getParameter("password");
        UserEntity userEntity = userService.getByResetPasswordToken(token);
        if (userEntity == null) {
            model.addAttribute("title", "Reset your password");
            model.addAttribute("mess", "Invalid Token");
        } else {
            userService.updatePassword(userEntity, password);
            model.addAttribute("mess", "You have success changed your password");
        }

        return token;

    }
}
