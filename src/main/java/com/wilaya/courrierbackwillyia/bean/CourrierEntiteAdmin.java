package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.*;

@Entity
public class CourrierEntiteAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Courrier courrier;
    @ManyToOne
    private EntiteAdmin entiteAdmin;

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

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
    }
}
