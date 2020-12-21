package com.exam.hostelmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hostel")
public class MasterController {

    @GetMapping("home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
    

    @GetMapping("error404")
    public String showError404(){
        return "page404";
    }
}

