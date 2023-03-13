package com.ConsultCRUD.Consult.Coders.Repository;

import com.ConsultCRUD.Consult.Coders.Model.CCoder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository <CCoder, Long> {

}
