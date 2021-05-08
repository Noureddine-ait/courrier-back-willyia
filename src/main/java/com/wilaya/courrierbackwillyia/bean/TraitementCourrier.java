package com.wilaya.courrierbackwillyia.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TraitementCourrier {

    private  Courrier courrier;
    private  String libelle;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateTraitement;
    private EntiteAdmin entiteAdmin;
    private      User responsble;




}
