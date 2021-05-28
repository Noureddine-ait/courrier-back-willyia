package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.*;

@Entity
public class Expediteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libellle;
    private String code;
    @ManyToOne
    private TypeExpediteur typeExpediteur;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibellle() {
        return libellle;
    }

    public void setLibellle(String libellle) {
        this.libellle = libellle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TypeExpediteur getTypeExpediteur() {
        return typeExpediteur;
    }

    public void setTypeExpediteur(TypeExpediteur typeExpediteur) {
        this.typeExpediteur = typeExpediteur;
    }
}
