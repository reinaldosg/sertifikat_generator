package com.learn.spring.certificate.gen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditPage {

    @RequestMapping("/edit-page")
    public String editPage() { return "Edit/EditImage"; }

    @RequestMapping("/save-img")
    public String saveImg() {
        // TODO
        return "";
    }

}
