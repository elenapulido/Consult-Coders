package com.ConsultCRUD.Consult.Coders.Repository;

import com.ConsultCRUD.Consult.Coders.Model.CConsultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository extends JpaRepository<CConsultation, Long> {

}
