package com.ConsultCRUD.Consult.Coders.Repository;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository <CConsultation, Long> {

}
