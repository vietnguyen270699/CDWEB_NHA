package com.exam.hostelmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hostel")
public class ContactController {

    @GetMapping("contact")
    public String contact() {
        return "contact";
    }

}
