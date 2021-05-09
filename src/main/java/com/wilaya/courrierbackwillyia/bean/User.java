package com.wilaya.courrierbackwillyia.bean;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login ;
    private String password;
    private String nom;
    private String prenom;
    @ManyToOne
    private EntiteAdmin entiteadmin ;
    @ManyToOne
    private Role role;

}
