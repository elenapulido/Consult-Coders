package com.ConsultCRUD.Consult.Coders.Controller;

import org.springframework.ui.Model;
import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Service.CConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CController {
    @Autowired
    CConsultationService cConsultationService;

    @GetMapping("/")
   public String readConsultation(Model model){
        model.addAttribute("consultation",cConsultationService.readConsultation() );
        return "home";

    }

    @GetMapping("/edit/{id}")
    public String readConsultationId(@PathVariable("id") Long id, Model model){
        model.addAttribute("consultation",cConsultationService.readConsultationId(id) );
        return "home";

    }
    @PostMapping ("/edit/{id}")
    public String updateConsultation(@RequestBody CConsultation consultation,@PathVariable("id")Long id){
        cConsultationService.updateConsultation(consultation,id);
        return "list";

    }

    @PostMapping("/create")
    public String createConsultation(@RequestBody CConsultation consultation){
        cConsultationService.createConsultation(consultation);
        return "redirect: /";

    }
    @GetMapping("/create")
    public String createConsultationGet(@RequestBody CConsultation consultation){
        cConsultationService.createConsultation(consultation);
        return "form";

    }

    @GetMapping ("/delete/{id}")
    public String deleteConsultation(@PathVariable("id")Long id){
        cConsultationService.deleteConsultation(id);
        return "list";

    }

}
