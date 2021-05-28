package com.wilaya.courrierbackwillyia.dao;
import com.wilaya.courrierbackwillyia.bean.ConsigneCourrier;
import com.wilaya.courrierbackwillyia.bean.Courrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ConsigneCourrierDao extends JpaRepository<ConsigneCourrier, Long> {
    List<ConsigneCourrier> findByCourrierRef(String ref);
    int deleteByCourrierRef(String ref);
    ConsigneCourrier findByRef(String ref);
}
