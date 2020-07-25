package com.learn.spring.certificate.gen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/welcome-page")
    public String execute() {
        return "Header/MainHeader";
    }

}
