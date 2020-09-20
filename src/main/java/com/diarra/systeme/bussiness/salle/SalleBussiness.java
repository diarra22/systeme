package com.diarra.systeme.bussiness.salle;

import com.diarra.systeme.bean.Salle;

import java.util.List;
import java.util.Optional;

public interface SalleBussiness {


    /*
     * Enregistrement d'une salle
     * @return enregistre une salle dans la base de donnée
     */
    Salle save(Salle salle);

    /**
     * Recherche les salles
     *
     * @return la liste des salles
     */
    List<Salle> getSalles();


}
