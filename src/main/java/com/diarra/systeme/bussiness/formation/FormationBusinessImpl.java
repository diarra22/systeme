package com.diarra.systeme.bussiness.formation;

import com.diarra.systeme.bean.Formation;
import com.diarra.systeme.bean.Salle;
import com.diarra.systeme.bean.User;
import com.diarra.systeme.dao.formation.FormationDao;
import com.diarra.systeme.dao.salle.SalleDao;
import com.diarra.systeme.dao.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationBusinessImpl implements FormationBusiness {

    @Autowired
    private FormationDao formationDao;
    @Autowired
    private SalleDao salleDao;
    @Autowired
    private UserDao userDao;

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
