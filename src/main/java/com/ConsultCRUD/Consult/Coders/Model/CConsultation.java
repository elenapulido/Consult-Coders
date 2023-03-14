package com.ConsultCRUD.Consult.Coders.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class CConsultation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private long id;
    private String name;
    private String surname;
    private int telephone;
    private String mail;
    private String theme;
    private String date;


}
