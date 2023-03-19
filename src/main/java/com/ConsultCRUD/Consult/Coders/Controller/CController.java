package com.ConsultCRUD.Consult.Coders.Controller;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Service.CConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CController {
    @Autowired
    CConsultationService cConsultationService;

    @GetMapping("/home")
    public String List (Model model) {
        cConsultationService.readConsultation();
        return "home";
    }

    @GetMapping("/form")
    public String FormController(Model model) {
        model.addAttribute("consultation", new CConsultation());
        return "form";
    }

//    @GetMapping("/read/{id}")
//    private Optional<CConsultation> readConsultationId(@PathVariable("id") Long id){
//       return cConsultationService.readConsultationId(id);
//
//    }
//
//    @PostMapping("/create")
//    public String createConsultation(@RequestBody CConsultation consultation){
//        cConsultationService.createConsultation(consultation);
//        return "home";
//    }
//
//    @PostMapping ("/edit/{id}")
//    public String updateConsultation(@RequestBody CConsultation consultation,@PathVariable("id")Long id){
//        cConsultationService.updateConsultation(consultation,id);
//        return "home";
//    }
//
//
//    @GetMapping ("/delete/{id}")
//    public String deleteConsultation(@PathVariable("id")Long id){
//        cConsultationService.deleteConsultation(id);
//        return "home";
//    }

}
