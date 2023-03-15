package com.ConsultCRUD.Consult.Coders.Controller;

import com.ConsultCRUD.Consult.Coders.Model.CForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CController {

    @GetMapping("/form")
    public String FormController(Model model) {
        model.addAttribute("form", new CForm());
        return "form";
    }

}
