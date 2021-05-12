package com.wilaya.courrierbackwillyia.dao;


import com.wilaya.courrierbackwillyia.bean.Courrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourrierDao extends JpaRepository<Courrier, Long> {

    Courrier findByRef(String ref);

    public int deleteByRef(String ref);





}
