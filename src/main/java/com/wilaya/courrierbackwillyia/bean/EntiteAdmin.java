package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.*;

@Entity
public class EntiteAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private Long code;
    @ManyToOne
    private User responsable;
    @ManyToOne
    private CategorieEntiteAdmin categorieEntiteAdmin;
    @ManyToOne
    private EntiteAdmin entiteAdminSuperieur;


}
