package com.diarra.systeme.bean;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long numeroSalle;

    private long nbPlacesSalle;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeSalle typeSalle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(long numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

    public long getNbPlacesSalle() {
        return nbPlacesSalle;
    }

    public void setNbPlacesSalle(long nbPlacesSalle) {
        this.nbPlacesSalle = nbPlacesSalle;
    }

    public TypeSalle getTypeSalle() {
        return typeSalle;
    }

    public void setTypeSalle(TypeSalle typeSalle) {
        this.typeSalle = typeSalle;
    }
}