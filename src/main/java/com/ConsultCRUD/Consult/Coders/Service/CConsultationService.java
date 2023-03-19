package com.ConsultCRUD.Consult.Coders.Service;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import com.ConsultCRUD.Consult.Coders.Repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CConsultationService {

    private IRepository iRepository;

    public CConsultationService(IRepository iRepository) {
        this.iRepository = iRepository;
    }

    public void createConsultation(CConsultation consultation){
        iRepository.save(consultation);
    }


    public List<CConsultation>getAll(){
        List<CConsultation> consultations = iRepository.findAll();
        return consultations;
    }

    // Hasta aquí atrás he conseguido ejecutar bien, aún falta que además de llevar los datos a la bbdd también los guarde yobviamente la parte de editar y eliminar.

    public CConsultation readConsultationId(Long id) throws ClassNotFoundException {
        return iRepository.findById(id).orElseThrow(()->new ClassNotFoundException("not found"));
    }

    public void updateConsultation(CConsultation consultation, Long id){
        consultation.setId(id);
        iRepository.save(consultation);

    }

    public void deleteConsultation(Long id){
        iRepository.deleteById(id);


   }


    public void setiRepository(IRepository iRepository) {
        this.iRepository = iRepository;
    }
}
