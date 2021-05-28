package com.wilaya.courrierbackwillyia.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Courrier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private TypeCourrier typeCourrier;
    @OneToOne
    private EntiteAdmin coordinateur;
    @OneToOne
    private SousDossier sousDossier;
    private String ref;
    private String annee;
    private String indice;
    private String numOrder;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateCourrier;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateBureauOrdre;
    private String Objet;
    @ManyToOne
    private SousTheme sousTheme;
    @ManyToOne
    private CategorieCourrier categorieCourrier;
    @ManyToOne
    private Expediteur expediteur;



    @ManyToOne
    private TypeExpediteur typeExpediteur;



    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "courrier")
    private List<ConsigneCourrier> consigneCourriers = new ArrayList<ConsigneCourrier>();


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "courrier")
    private List<TraitementCourrier> traitementCourriers = new ArrayList<TraitementCourrier>();

    public List<ConsigneCourrier> getConsigneCourriers() {
        return consigneCourriers;
    }

    public void setConsigneCourriers(List<ConsigneCourrier> consigneCourriers) {
        this.consigneCourriers = consigneCourriers;
    }

    public List<TraitementCourrier> getTraitementCourriers() {
        return traitementCourriers;
    }

    public void setTraitementCourriers(List<TraitementCourrier> traitementCourriers) {
        this.traitementCourriers = traitementCourriers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeCourrier getTypeCourrier() {
        return typeCourrier;
    }

    public void setTypeCourrier(TypeCourrier typeCourrier) {
        this.typeCourrier = typeCourrier;
    }

    public EntiteAdmin getCoordinateur() {
        return coordinateur;
    }

    public void setCoordinateur(EntiteAdmin coordinateur) {
        this.coordinateur = coordinateur;
    }

    public SousDossier getSousDossier() {
        return sousDossier;
    }

    public void setSousDossier(SousDossier sousDossier) {
        this.sousDossier = sousDossier;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(String numOrder) {
        this.numOrder = numOrder;
    }

    public Date getDateCourrier() {
        return dateCourrier;
    }

    public void setDateCourrier(Date dateCourrier) {
        this.dateCourrier = dateCourrier;
    }

    public Date getDateBureauOrdre() {
        return dateBureauOrdre;
    }

    public void setDateBureauOrdre(Date dateBureauOrdre) {
        this.dateBureauOrdre = dateBureauOrdre;
    }

    public String getObjet() {
        return Objet;
    }

    public void setObjet(String objet) {
        Objet = objet;
    }

    public SousTheme getSousTheme() {
        return sousTheme;
    }

    public void setSousTheme(SousTheme sousTheme) {
        this.sousTheme = sousTheme;
    }

    public CategorieCourrier getCategorieCourrier() {
        return categorieCourrier;
    }

    public void setCategorieCourrier(CategorieCourrier categorieCourrier) {
        this.categorieCourrier = categorieCourrier;
    }

    public Expediteur getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(Expediteur expediteur) {
        this.expediteur = expediteur;
    }

    public TypeExpediteur getTypeExpediteur() {
        return typeExpediteur;
    }

    public void setTypeExpediteur(TypeExpediteur typeExpediteur) {
        this.typeExpediteur = typeExpediteur;
    }
}


