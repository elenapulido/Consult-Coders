package com.ConsultCRUD.Consult.Coders.Repository;

import com.ConsultCRUD.Consult.Coders.models.Coder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRepository extends JpaRepository <Coder, Integer>{

    static Optional<Coder> findByIDCoder(String IDCoder) {
        return null;
    }

    static boolean existsByIDCoder(String IDCoder) {
        return false;
    }
}
