package com.ConsultCRUD.Consult.Coders.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String home() {
        return "index";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }
}
