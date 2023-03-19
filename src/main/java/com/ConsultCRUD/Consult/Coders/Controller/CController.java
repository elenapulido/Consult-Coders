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
        cConsultationService.getAll();
        return "index";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("consultation", new CConsultation());
        return "form";
    }

    @PostMapping("/create")
    public String createConsultation(@ModelAttribute CConsultation consultation, Model model) {
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

    // Hasta aquí atrás he conseguido ejecutar bien, aún falta que además de llevar los datos a la bbdd también los guarde yobviamente la parte de editar y eliminar.


    @PostMapping("/edit/{id}")
    public String updateConsultation(@RequestBody CConsultation consultation, @PathVariable("id") Long id) {
        cConsultationService.updateConsultation(consultation, id);
        return "list";
    }




    @GetMapping("/delete/{id}")
    public String deleteConsultation(@PathVariable("id") Long id) {
        cConsultationService.deleteConsultation(id);
        return "home";
    }


}
