package com.diarra.systeme.bussiness.remarque;

import com.diarra.systeme.bean.Formation;
import com.diarra.systeme.bean.Remarque;

import java.util.List;

public interface RemarqueBusiness {
    /**
     *
     * @param remarque
     * @return
     */
    Remarque save(Remarque remarque);


    List<Remarque> geRemarque();


}
