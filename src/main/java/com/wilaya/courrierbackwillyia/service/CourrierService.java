package com.wilaya.courrierbackwillyia.service;


import com.wilaya.courrierbackwillyia.bean.Courrier;
import com.wilaya.courrierbackwillyia.bean.TraitementCourrier;
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

    public int save(Courrier courrier) {

        if (findByRef(courrier.getRef()) != null) {
            return -1;
        } else {
            courrierDao.save(courrier);
            consigneCourrierService.save(courrier , courrier.getConsigneCourriers());
            traitementCourrierService.save(courrier , courrier.getTraitementCourriers() );

            return 1;
        }


    }

    @Autowired
 private CourrierDao  courrierDao;

    @Autowired
    private ConsigneCourrierService consigneCourrierService;

    @Autowired
    private TraitementCourrierService traitementCourrierService;
}
