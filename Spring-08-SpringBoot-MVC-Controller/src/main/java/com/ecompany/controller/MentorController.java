package com.ecompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mentor")
public class MentorController {

    @RequestMapping("/show")
    public String showForm(){
        return "mentor/home";
    }
}
