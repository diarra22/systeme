package com.diarra.systeme.bussiness.salle;

import com.diarra.systeme.bean.Salle;
import com.diarra.systeme.bean.User;
import com.diarra.systeme.dao.salle.SalleDao;
import com.diarra.systeme.dao.user.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class SalleBussinessImpl implements SalleBussiness {

    @Autowired
    private SalleDao salleDao;


    @Override
    public Salle save(Salle salle) {
        Salle salleSaved = salleDao.save(salle);
        return salleSaved;
    }


    @Override
    public List<Salle> getSalles() {
        return salleDao.findAll();
    }
}
