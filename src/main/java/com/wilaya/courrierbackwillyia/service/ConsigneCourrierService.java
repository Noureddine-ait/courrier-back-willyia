package com.wilaya.courrierbackwillyia.service;


import com.wilaya.courrierbackwillyia.bean.ConsigneCourrier;
import com.wilaya.courrierbackwillyia.bean.Courrier;
import com.wilaya.courrierbackwillyia.dao.ConsigneCourrierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsigneCourrierService {

    @Autowired
    private CourrierService courrierService;

    @Autowired
    private ConsigneCourrierDao consigneCourrierDao;


    public List<ConsigneCourrier> findByCourrierRef(String ref) {
        return consigneCourrierDao.findByCourrierRef(ref);
    }

    public int deleteByCourrierRef(String ref) {
        return consigneCourrierDao.deleteByCourrierRef(ref);
    }

    public int save (Courrier courrier, List<ConsigneCourrier> consigneCourriers) {
        if (consigneCourriers == null || consigneCourriers.isEmpty()) {
            return -1;
        }
       for(ConsigneCourrier consigneCourrier : consigneCourriers ) {
           consigneCourrier.setCourrier(courrier);
           consigneCourrierDao.save(consigneCourrier);
    }
        return 1;
    }
public void update(ConsigneCourrier consigneCourrier){
    consigneCourrierDao.save(consigneCourrier);
}
public List<ConsigneCourrier> findAll(){ return consigneCourrierDao.findAll(); }


    public ConsigneCourrier findByRef(String ref) {
        return consigneCourrierDao.findByRef(ref);
    }
}
