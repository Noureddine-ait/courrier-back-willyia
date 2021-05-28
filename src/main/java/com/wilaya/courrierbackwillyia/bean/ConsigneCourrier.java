package com.wilaya.courrierbackwillyia.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ConsigneCourrier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private  Courrier courrier;
    private  String libelle;
    private String ref;



    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateConsigne;
    @ManyToOne
    private EntiteAdmin entiteAdmin;
    @ManyToOne
    private User responsble;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public User getResponsble() {
        return responsble;
    }

    public void setResponsble(User responsble) {
        this.responsble = responsble;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
    }

    public Date getDateConsigne() {
        return dateConsigne;
    }

    public void setDateConsigne(Date dateConsigne) {
        this.dateConsigne = dateConsigne;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Courrier getCourrier() {
        return courrier;
    }

    public void setCourrier(Courrier courrier) {
        this.courrier = courrier;
    }
}
