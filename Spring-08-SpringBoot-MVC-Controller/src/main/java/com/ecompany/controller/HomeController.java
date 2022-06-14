package com.ecompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }



    @RequestMapping(method = RequestMethod.GET, value = "/moses")
    public String getRequesMapping2(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/moses")
    public String getRequesMapping3(){
        return "home";
    }

    @GetMapping("/ecompany")
    public String getMappingEx(){
        return "home";
    }


    @PostMapping("/ecompany")
    public String getMappingEx2(){
        return "home";
    }


    @GetMapping("/ecompany/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("name is "+name);
        return "home";
    }

    @GetMapping("/ecompany/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name,@PathVariable("email") String email){
        System.out.println("name is "+name);
        System.out.println("email is "+email);
        return "home";
    }

    @GetMapping("/ecompany/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("course name is "+course);
        return "home";
    }

    @GetMapping(value = "/course")
    public String requestParamEx2(@RequestParam(value = "name", required = false, defaultValue = "moses") String course){
        System.out.println("course name is "+course);
        return "home";
    }





}
