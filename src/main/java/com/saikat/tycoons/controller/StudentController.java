package com.saikat.tycoons.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/app")
public class StudentController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "index";
    }



}
