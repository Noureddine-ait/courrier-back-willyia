package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expediteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libellle;
    private Long code;
    private TypeExpediteur typeExpediteur;


}
