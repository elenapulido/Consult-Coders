package com.ConsultCRUD.Consult.Coders.Repository;

import com.ConsultCRUD.Consult.Coders.models.Coder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository <Coder, Integer>{

}
