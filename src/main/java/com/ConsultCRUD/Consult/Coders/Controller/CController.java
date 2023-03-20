package com.ConsultCRUD.Consult.Coders.Controller;

import org.springframework.ui.Model;
import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Service.CConsultationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Controller
public class CController {
    @Autowired
    CConsultationService cConsultationService;

    @GetMapping("/")
   public String readConsultation(Model model) {
        model.addAttribute("consultation", cConsultationService.readConsultation());
        return "home";
    }

    @GetMapping("/edit/{id}")
    public String readConsultationId(@PathVariable("id") Long id, Model model){
        model.addAttribute("consultation",cConsultationService.readConsultationId(id) );
        return "home";

    }

    @PostMapping ("/edit/{id}")
    public String updateConsultation(@RequestBody CConsultation consultation,@PathVariable("id")Long id){
            cConsultationService.updateConsultation(consultation, id);
            return "list";
        }

    @GetMapping("/form")
    public String showForm(Model model) {
        cConsultationService.readConsultation();
        return "home";
    }


    @PostMapping("/create")
    public String createConsultation(@ModelAttribute CConsultation consultation, Model model){
                cConsultationService.createConsultation(consultation);
                return "redirect:/list";
    }


    @GetMapping("/read/{id}")
    private ResponseEntity<CConsultation> readConsultationId(@PathVariable("id") Long id) {
        try {
            CConsultation consultation = cConsultationService.readConsultationId(id);
            return ResponseEntity.status(200).body(consultation);
        } catch (Exception ex) {
            return null;
        }
    }


    @GetMapping("/list")
    public String showList(Model model) {
        List<CConsultation> consultations = cConsultationService.getAll();
        model.addAttribute("consultations", consultations);
        return "list";
    }

}
