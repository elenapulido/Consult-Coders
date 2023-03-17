package com.ConsultCRUD.Consult.Coders.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

     @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @GetMapping("/list")
    public String list() {
        return "list";
    }

    @GetMapping("/edit")
    public String edit() {
        return "edit";
    }

}

