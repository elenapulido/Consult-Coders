package com.ConsultCRUD.Consult.Coders.Service;

import com.ConsultCRUD.Consult.Coders.Model.CCoder;
import com.ConsultCRUD.Consult.Coders.Repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CCoderService {
    @Autowired
    IRepository iRepository;

    public void saveCoder(CCoder coder){
        iRepository.save(coder);


    }

    public void getCoder(){

    }

    public void deleteCoder(){

    }

    public void editCoder(){

    }




}
