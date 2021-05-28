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
    private String ref;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateTraitement;
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

    public Courrier getCourrier() {
        return courrier;
    }

    public void setCourrier(Courrier courrier) {
        this.courrier = courrier;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Date dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
    }

    public User getResponsble() {
        return responsble;
    }

    public void setResponsble(User responsble) {
        this.responsble = responsble;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
