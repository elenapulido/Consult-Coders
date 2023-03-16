package com.ConsultCRUD.Consult.Coders.models;

import jakarta.persistence.*;

@Entity
@Table(name = "coders")
public class Coder {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_coder")
    private int id;
    private String name;
    private String surname;
    private String mail;

}
