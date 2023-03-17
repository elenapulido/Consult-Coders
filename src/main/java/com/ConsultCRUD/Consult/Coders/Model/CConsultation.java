package com.ConsultCRUD.Consult.Coders.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name= "coders")
public class CConsultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private long id;

    @Column (name = "name", nullable = false)
    private String name;
    @Column (name = "surname", nullable = false)
    private String surname;
    @Column (name = "phone", nullable = false)
    private int phone;
    @Column (name = "email", nullable = false)
    private String email;
    @Column (name = "theme", nullable = false)
    private String theme;
    @Column (name = "date", nullable = true)
    private String date;

}

