package com.diarra.systeme.controller;

import com.diarra.systeme.bean.Formation;
import com.diarra.systeme.bussiness.formation.FormationBusiness;
import com.diarra.systeme.dao.formation.FormationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(FormationController.PATH)
public class FormationController {

    static final String PATH = "form";
    private FormationBusiness formationBusiness;

    @PostMapping("/addform")
    public Formation addFormation(@Valid @RequestBody Formation formation){
        return formationBusiness.save(formation);
    }



    @GetMapping("/getForm")
    public List<Formation> retrieveAllFormation() {
        return formationBusiness.geFormation();
    }


}

