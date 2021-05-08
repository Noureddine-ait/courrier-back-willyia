package com.wilaya.courrierbackwillyia.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Courrier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private TypeCourrier typeCourrier;
    private EntiteAdmin coordinateur;
    private SousDossier sousDossier;
    private String ref;
    private String annee;
    private String indice;
    private String numOrder;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateCourrier;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateBureauOrdre;
    private String Objet;
    private SousTheme sousTheme;
    private CategorieCourrier categorieCourrier;
    private Expediteur expediteur;
    private TypeCourrier typeExpediteur;







}


