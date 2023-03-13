package com.ConsultCRUD.Consult.Coders.Controller;

import com.ConsultCRUD.Consult.Coders.Service.CCoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CController {
    @Autowired
    CCoderService cCoderService;

    @PostMapping
    private void getCoder(){

    }

}
