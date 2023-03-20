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
    public String home(){
        return "home";

    }

    @GetMapping("/list")
    public String readConsultation(Model model){
        model.addAttribute("consultation",cConsultationService.readConsultation() );
        return "list";

    }

    @GetMapping("/edit/{id}")
    public String readConsultationId(@PathVariable("id") Long id, Model model){
        model.addAttribute("consultation",cConsultationService.readConsultationId(id) );
        return "edit";

    }
    @PostMapping ("/edit/{id}")
    public String updateConsultation(@ModelAttribute CConsultation consultation,@PathVariable("id")Long id){
        cConsultationService.updateConsultation(consultation,id);
        return "redirect:/list";

    }

    @GetMapping("/create")
    public String createConsultationGet(Model model){
        model.addAttribute("consultation", new CConsultation());
        return "form";

    }

    @PostMapping("/create")
    public String createConsultation(@ModelAttribute CConsultation consultation){
        cConsultationService.createConsultation(consultation);
        return "redirect:/list";

    }


    @GetMapping ("/delete/{id}")
    public String deleteConsultation(@PathVariable("id")Long id){
        cConsultationService.deleteConsultation(id);
        return "redirect:/list";

    }

}
