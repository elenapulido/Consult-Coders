package com.ConsultCRUD.Consult.Coders.Controller;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Service.CConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CController {
    @Autowired
    CConsultationService cConsultationService;

    @PostMapping("/consultation")
    private void createConsultation(@RequestBody CConsultation consultation){
        cConsultationService.createConsultation(consultation);

    }

}
