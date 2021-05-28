package com.wilaya.courrierbackwillyia.service;


import com.wilaya.courrierbackwillyia.bean.Courrier;
import com.wilaya.courrierbackwillyia.dao.CourrierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourrierService {


    public Courrier findByRef(String ref) {
        return courrierDao.findByRef(ref);
    }
    @Transactional
    public int deleteByRef(String ref) {
        System.out.println("ref =   " + ref);
        int deleteByUserRef1 = consigneCourrierService.deleteByCourrierRef(ref);
        int deleteByUserRef2 = traitementCourrierService.deleteByCourrierRef(ref);
        int deleteByRef = courrierDao.deleteByRef(ref);

        return deleteByUserRef1+deleteByUserRef2+deleteByRef;
    }


    public void update(Courrier courrier){courrierDao.save(courrier);}


    public List<Courrier> findAll() {
        return courrierDao.findAll();
    }

    public Courrier save(Courrier courrier) {

        if (findByRef(courrier.getRef()) != null) {
            return null;
        }
        else {
            courrier.setTypeCourrier(typeCourrierService.findByCode(courrier.getTypeCourrier().getCode()));
            courrier.setCategorieCourrier(categorieCourrierService.findByCode(courrier.getCategorieCourrier().getCode()));
            courrier.setCoordinateur(entiteAdminService.findByCode(courrier.getCoordinateur().getCode()));
             courrier.setSousDossier(sousDossierService.findByCode(courrier.getSousDossier().getCode()));
             courrier.setSousTheme(sousThemeService.findByCode(courrier.getSousTheme().getCode()));
             courrier.setExpediteur(expediteurService.findByCode(courrier.getExpediteur().getCode()));
             courrier.setTypeExpediteur(typeExpediteurService.findByCode(courrier.getTypeExpediteur().getCode()));
            courrierDao.save(courrier);
            consigneCourrierService.save(courrier , courrier.getConsigneCourriers());
            traitementCourrierService.save(courrier , courrier.getTraitementCourriers() );

            return courrier;

        }


    }
    @Autowired
    private TypeExpediteurService typeExpediteurService ;
    @Autowired
    private ExpediteurService expediteurService;

    @Autowired
    private SousThemeService sousThemeService ;

    @Autowired
    private SousDossierService sousDossierService ;

    @Autowired
    private EntiteAdminService entiteAdminService ;

    @Autowired
    private CategorieCourrierService categorieCourrierService ;
    @Autowired
    private TypeCourrierService typeCourrierService;
    @Autowired
    private CourrierDao  courrierDao;

    @Autowired
    private ConsigneCourrierService consigneCourrierService;

    @Autowired
    private TraitementCourrierService traitementCourrierService;
}
