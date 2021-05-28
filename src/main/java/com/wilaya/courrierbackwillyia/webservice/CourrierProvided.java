package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.Courrier;
import com.wilaya.courrierbackwillyia.service.CourrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("application/courrier")
public class CourrierProvided {

    @GetMapping("/ref/{ref}")
    public Courrier findByRef(@PathVariable String ref) {
        return courrierService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return courrierService.deleteByRef(ref);
    }
    @PutMapping("/")
    public void update(@RequestBody Courrier courrier) {
        courrierService.update(courrier);
    }
    @GetMapping("/")
    public List<Courrier> findAll() {
        return courrierService.findAll();
    }
    @PostMapping("/")
    public Courrier save(@RequestBody  Courrier courrier) {
        return courrierService.save(courrier);
    }
    @Autowired
    private CourrierService courrierService;
}
