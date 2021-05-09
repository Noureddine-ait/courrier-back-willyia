package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.*;

@Entity
public class SousTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private Long code;
    @ManyToOne
    private Theme theme;


}
