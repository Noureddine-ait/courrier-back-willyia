package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.*;

@Entity
public class EntiteAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String code;
    @ManyToOne
    private User responsable;
    @ManyToOne
    private CategorieEntiteAdmin categorieEntiteAdmin;
    @ManyToOne
    private EntiteAdmin entiteAdminSuperieur;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getResponsable() {
        return responsable;
    }

    public void setResponsable(User responsable) {
        this.responsable = responsable;
    }

    public CategorieEntiteAdmin getCategorieEntiteAdmin() {
        return categorieEntiteAdmin;
    }

    public void setCategorieEntiteAdmin(CategorieEntiteAdmin categorieEntiteAdmin) {
        this.categorieEntiteAdmin = categorieEntiteAdmin;
    }

    public EntiteAdmin getEntiteAdminSuperieur() {
        return entiteAdminSuperieur;
    }

    public void setEntiteAdminSuperieur(EntiteAdmin entiteAdminSuperieur) {
        this.entiteAdminSuperieur = entiteAdminSuperieur;
    }
}
