package com.wilaya.courrierbackwillyia.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
public class TraitementCourrier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Courrier courrier;
    private String libelle;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateTraitement;
    @ManyToOne
    private EntiteAdmin entiteAdmin;
    @ManyToOne
    private User responsble;

}
