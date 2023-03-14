package com.ConsultCRUD.Consult.Coders.Controllers;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Service.CConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CController {
    @Autowired
    CConsultationService cConsultationService;

    @GetMapping("/consultation")
    private List<CConsultation> readConsultation(){
        return CConsultationService.readConsultation();

    }

    @PostMapping("/consultation")
    private void createConsultation(@RequestBody CConsultation consultation){
        cConsultationService.createConsultation(consultation);

    }



}
