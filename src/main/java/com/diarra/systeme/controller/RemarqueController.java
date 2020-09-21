package com.diarra.systeme.controller;

import com.diarra.systeme.bean.Remarque;
import com.diarra.systeme.bean.Salle;
import com.diarra.systeme.bussiness.remarque.RemarqueBusiness;
import com.diarra.systeme.bussiness.salle.SalleBussiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(RemarqueController.PATH)
public class RemarqueController {
    static final String PATH = "remark";
    private RemarqueBusiness remarqueBusiness;

    @Autowired
    public RemarqueController(RemarqueBusiness remarqueBusiness) {
        this.remarqueBusiness = remarqueBusiness;
    }

    @PostMapping("/addRemark")
    public Remarque addRemarks(@Valid @RequestBody Remarque remarque){
        return remarqueBusiness.save(remarque);
    }

    @GetMapping("/getRemarks")
    public List<Remarque> retrieveAllRemarks() {
        return remarqueBusiness.geRemarque();
    }



}
