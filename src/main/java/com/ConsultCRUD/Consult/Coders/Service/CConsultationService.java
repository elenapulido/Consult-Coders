package com.ConsultCRUD.Consult.Coders.Service;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CConsultationService {
    @Autowired
    IRepository iRepository;

    public void createConsultation(CConsultation consultation){
        iRepository.save(consultation);


    }

    public static List<CConsultation>readConsultation(){
        List<CConsultation> consultations = new ArrayList<CConsultation>();
        consultations.addAll(iRepository.findAll());
        return consultations;


    }
    public void updateConsultation(){

    }

    public void deleteConsultation(){

    }






}
