package com.alnicode.test_website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    
    @GetMapping("/home")
    public String getHome() {
        return "index.html";
    }
}
