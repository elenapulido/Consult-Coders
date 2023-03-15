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

   private IRepository iRepository;

    public void createConsultation(CConsultation consultation){
        iRepository.save(consultation);


    }

    public List<CConsultation>readConsultation(){
        List<CConsultation> consultations = new ArrayList<CConsultation>(iRepository.findAll());
        return consultations;


    }
    public void updateConsultation(){

    }

    public void deleteConsultation(){

    }


    public void setiRepository(IRepository iRepository) {
        this.iRepository = iRepository;
    }
}
