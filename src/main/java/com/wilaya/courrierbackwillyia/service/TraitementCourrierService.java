package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.ConsigneCourrier;
import com.wilaya.courrierbackwillyia.bean.Courrier;
import com.wilaya.courrierbackwillyia.bean.TraitementCourrier;
import com.wilaya.courrierbackwillyia.dao.TraitementCourrierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraitementCourrierService {
    public List<TraitementCourrier> findByCourrierRef(String ref) {
        return traitementCourrierDao.findByCourrierRef(ref);
    }


    @Autowired
    private TraitementCourrierDao traitementCourrierDao;


    @Autowired
    private CourrierService courrierService;

    public int deleteByCourrierRef(String ref) {
        return traitementCourrierDao.deleteByCourrierRef(ref);
    }

    public int save(Courrier courrier, List<TraitementCourrier> traitementCourriers ) {
        if (traitementCourriers == null || traitementCourriers.isEmpty()) {
            return -1;
        }
        for ( TraitementCourrier traitementCourrier : traitementCourriers) {
            traitementCourrier.setCourrier(courrier);
            traitementCourrierDao.save(traitementCourrier);

        }
        return 1;
    }

    public TraitementCourrier findByRef(String ref) {
        return traitementCourrierDao.findByRef(ref);
    }
}
