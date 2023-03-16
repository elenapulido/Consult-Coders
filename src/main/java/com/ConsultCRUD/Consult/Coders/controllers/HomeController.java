package com.ConsultCRUD.Consult.Coders.controllers;

import com.ConsultCRUD.Consult.Coders.Model.CForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

     @GetMapping("")
    public String home() {
        return "index";
    }

    @GetMapping("/form")
    public String FormController(Model model) {
        model.addAttribute("form", new CForm());
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

