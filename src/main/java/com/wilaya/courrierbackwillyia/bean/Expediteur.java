package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.*;

@Entity
public class Expediteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libellle;
    private Long code;
    @ManyToOne
    private TypeExpediteur typeExpediteur;


}
