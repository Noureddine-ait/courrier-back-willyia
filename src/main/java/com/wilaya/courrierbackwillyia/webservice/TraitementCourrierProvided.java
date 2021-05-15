package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.Courrier;
import com.wilaya.courrierbackwillyia.bean.TraitementCourrier;
import com.wilaya.courrierbackwillyia.service.TraitementCourrierService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/TraitementCourrier")
public class TraitementCourrierProvided {
    @Autowired
    private TraitementCourrierService traitementCourrierService;
@GetMapping("courrier-ref/ref/{ref}")
    public List<TraitementCourrier> findByCourrierRef(@PathVariable String ref) {
    return traitementCourrierService.findByCourrierRef(ref);
}
@DeleteMapping("courrier-ref/ref/{ref}")
    public int deleteByCourrierRef(@PathVariable String ref) {
        return traitementCourrierService.deleteByCourrierRef(ref);
    }
/*
@PostMapping("/")
    public int save(@RequestBody Courrier courrier, List<TraitementCourrier> traitementCourriers) {
        return traitementCourrierService.save(courrier, traitementCourriers);
    }*/
}
