package com.ConsultCRUD.Consult.Coders.Controller;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Service.CConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class CController {
    @Autowired
    CConsultationService cConsultationService;

    @GetMapping("/home")
    public String home(Model model) {
        cConsultationService.readConsultation();
        return "index";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("consultation", new CConsultation());
        return "form";
    }

    @PostMapping("/create")
    public String createConsultation(@ModelAttribute CConsultation consultation,Model model) {
        cConsultationService.createConsultation(consultation);
        return "redirect:/home";
    }


    @GetMapping("/read/{id}")
    private ResponseEntity<CConsultation> readConsultationId(@PathVariable("id") Long id) {

        try {
            CConsultation consultation = cConsultationService.readConsultationId(id);
            return ResponseEntity.status(200).body(consultation);
        } catch (Exception ex) {
            return  null;
        }


    }

    @PostMapping("/edit/{id}")
    public String updateConsultation(@RequestBody CConsultation consultation, @PathVariable("id") Long id) {
        cConsultationService.updateConsultation(consultation, id);
        return "home";
    }


    @GetMapping("/delete/{id}")
    public String deleteConsultation(@PathVariable("id") Long id) {
        cConsultationService.deleteConsultation(id);
        return "home";
    }

}
