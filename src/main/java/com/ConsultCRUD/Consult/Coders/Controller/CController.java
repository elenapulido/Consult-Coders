package com.ConsultCRUD.Consult.Coders.Controller;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Service.CConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CController {
    @Autowired
    CConsultationService cConsultationService;

    @GetMapping("/consultation")
    private List<CConsultation> readConsultation(){
        return cConsultationService.readConsultation();

    }
    //@GetMapping("/consultation/{id}")
    //private List<CConsultation> readConsultationId(@PathVariable("id") Long id){
       // return cConsultationService.readConsultation(id);

   // }

    @PostMapping("/consultation")
    private void createConsultation(@RequestBody CConsultation consultation){
        cConsultationService.createConsultation(consultation);

    }
    @PutMapping("/consultation/{id}")
    private void updateConsultation(@RequestBody CConsultation consultation,@PathVariable("id")Long id){
        cConsultationService.updateConsultation(consultation,id);

    }


    @DeleteMapping("/consultation/{id}")
    private void deleteConsultation(@PathVariable("id")Long id){
        cConsultationService.deleteConsultation(id);


    }



}
