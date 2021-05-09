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
}
