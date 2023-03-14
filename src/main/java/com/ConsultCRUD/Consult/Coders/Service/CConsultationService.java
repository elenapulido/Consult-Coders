package com.ConsultCRUD.Consult.Coders.Service;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CConsultationService {
    @Autowired
    IRepository iRepository;

    public void createConsultation(CConsultation consultation){
        iRepository.save(consultation);


    }

    public void getConsultation(CConsultation consultation){

    }

    public void deleteConsultation(){

    }

    public void editConsultation(){

    }




}
