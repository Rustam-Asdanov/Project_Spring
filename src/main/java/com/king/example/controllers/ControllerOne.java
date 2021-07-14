package com.king.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class ControllerOne {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
}
