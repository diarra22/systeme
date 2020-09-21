package com.diarra.systeme.bussiness.remarque;

import com.diarra.systeme.bean.Remarque;
import com.diarra.systeme.dao.remarque.RemarqueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RemarqueBusinessImpl implements RemarqueBusiness{
    @Autowired
    private RemarqueDao remarqueDao;
    @Override
    public Remarque save(Remarque remarque) {
       return remarqueDao.save(remarque);
    }

    @Override
    public List<Remarque> geRemarque() {
       return remarqueDao.findAll();
    }
}
