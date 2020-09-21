package com.diarra.systeme.bussiness.formation;

import com.diarra.systeme.bean.Formation;
import com.diarra.systeme.bean.User;
import com.diarra.systeme.dao.formation.FormationDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FormationBusinessImpl implements FormationBusiness {

    @Autowired
    private FormationDao formationDao;

    @Override
    public Formation save(Formation formation) {
        Formation formationSaved = formationDao.save(formation);
        return formationSaved;
    }

    @Override
    public List<Formation> geFormation() {
        return formationDao.findAll();
    }

}
