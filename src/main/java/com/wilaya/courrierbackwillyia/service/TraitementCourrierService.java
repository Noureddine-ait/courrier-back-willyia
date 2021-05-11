package com.wilaya.courrierbackwillyia.service;

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


    public int deleteByCourrierRef(String ref) {
        return traitementCourrierDao.deleteByCourrierRef(ref);
    }

    public int save(Courrier courrier, List<TraitementCourrier> traitementCourriers ) {
        for ( TraitementCourrier traitementCourrier : traitementCourriers) {
            traitementCourrier.setCourrier(courrier);
            traitementCourrierDao.save(traitementCourrier);

        }
        return 1;
    }
}
