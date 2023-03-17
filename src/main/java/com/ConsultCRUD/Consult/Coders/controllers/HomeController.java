package com.ConsultCRUD.Consult.Coders.controllers;

import com.ConsultCRUD.Consult.Coders.Model.CForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class HomeController {


    @GetMapping("/home")
    public String home() {

        return "home";
    }

    @GetMapping("/form")
    public String FormController(Model model) {
        model.addAttribute("cform", new CForm());
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

