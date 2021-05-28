package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.ConsigneCourrier;
import com.wilaya.courrierbackwillyia.service.ConsigneCourrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/ConsigneCourrier")
public class ConsigneCourrierProvided {



    @GetMapping("/ref/{ref}")
    public ConsigneCourrier findByRef(@PathVariable String ref) {
        return consigneCourrierService.findByRef(ref);
    }

    @GetMapping("courrier-ref/ref/{ref}")
    public List<ConsigneCourrier> findByCourrierRef(@PathVariable String ref) {
        return consigneCourrierService.findByCourrierRef(ref);
    }
    @DeleteMapping("courrier-ref/ref/{ref}")
    public int deleteByCourrierRef(@PathVariable String ref) {
        return consigneCourrierService.deleteByCourrierRef(ref);
    }
      /*
    @PostMapping("/")
    public int save(Courrier courrier, List<ConsigneCourrier> consigneCourriers) {
        return consigneCourrierService.save(courrier, consigneCourriers);
    }
     */

    @PutMapping("/")
    public void update(@RequestBody ConsigneCourrier consigneCourrier) {
        consigneCourrierService.update(consigneCourrier);
    }
   @GetMapping("/")
    public List<ConsigneCourrier> findAll() {
        return consigneCourrierService.findAll();
    }

    @Autowired
    private ConsigneCourrierService  consigneCourrierService;

}
