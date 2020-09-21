package com.diarra.systeme.bussiness.formation;

import com.diarra.systeme.bean.Formation;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

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
