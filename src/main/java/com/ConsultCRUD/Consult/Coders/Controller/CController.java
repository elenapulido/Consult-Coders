package com.ConsultCRUD.Consult.Coders.Controller;

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

    @GetMapping("/consultation")
   public String List (Model model) readConsultation(){
        return cConsultationService.readConsultation();

    }
    @GetMapping("/read/{id}")
    private Optional<CConsultation> readConsultationId(@PathVariable("id") Long id){
       return cConsultationService.readConsultationId(id);

    }

    @PostMapping("/create")
    public String createConsultation(@RequestBody CConsultation consultation){
        cConsultationService.createConsultation(consultation);

    }
    @PostMapping ("/edit/{id}")
    public String updateConsultation(@RequestBody CConsultation consultation,@PathVariable("id")Long id){
        cConsultationService.updateConsultation(consultation,id);

    }


    @GetMapping ("/delete/{id}")
    public String deleteConsultation(@PathVariable("id")Long id){
        cConsultationService.deleteConsultation(id);


    }



}
