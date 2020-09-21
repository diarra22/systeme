package com.diarra.systeme.bussiness.formation;

import com.diarra.systeme.bean.Formation;
import com.diarra.systeme.bean.User;

import java.util.List;
import java.util.Optional;

public interface FormationBusiness {

    /**
     *
     * @param formation
     * @return permet de sauvegarder une formation
     */
    Formation save(Formation formation);

    /**
     *
     * @return la liste des formation
     */

    List<Formation> geFormation();

    /**
     * @return retourne les formatioons par utilisateurs.
     *
     */




}
