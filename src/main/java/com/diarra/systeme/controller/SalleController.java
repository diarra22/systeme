package com.diarra.systeme.controller;

import com.diarra.systeme.bean.Salle;
import com.diarra.systeme.bussiness.salle.SalleBussiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Controller Delivery.
 */
@RestController
@RequestMapping(SalleController.PATH)
public class SalleController {

    static final String PATH = "salles";
    private SalleBussiness salleBussiness;

    @Autowired
    public SalleController(SalleBussiness salleBussiness) {
        this.salleBussiness = salleBussiness;
    }

    @PostMapping("/addSalle")
    public Salle addSalle(@Valid @RequestBody Salle salle){
        return salleBussiness.save(salle);
    }

    @GetMapping("/getSalles")
    public List<Salle> retrieveAllSalles() {
        return salleBussiness.getSalles();
    }






}
