package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.Courrier;
import com.wilaya.courrierbackwillyia.bean.TraitementCourrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  TraitementCourrierDao extends JpaRepository<TraitementCourrier,Long> {

    List<TraitementCourrier> findByCourrierRef(String ref);
    int deleteByCourrierRef(String ref);

}