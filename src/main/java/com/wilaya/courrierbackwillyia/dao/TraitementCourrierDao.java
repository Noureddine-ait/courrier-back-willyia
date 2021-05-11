package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.Courrier;
import com.wilaya.courrierbackwillyia.bean.TraitementCourrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  TraitementCourrierDao extends JpaRepository<TraitementCourrier,Long> {

    TraitementCourrier findByRef(String ref);
    TraitementCourrier findByCourrierRef(String ref);
}