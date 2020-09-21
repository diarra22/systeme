package com.diarra.systeme.bean;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@AllArgsConstructor
@Entity
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nomForm;
    private Date dateDebutForm;
    private Date dateFinForm;
    public Formation(){}

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "salleId", referencedColumnName = "id", insertable = false, updatable = false)
    private Salle salle;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomForm() {
        return nomForm;
    }

    public void setNomForm(String nomForm) {
        this.nomForm = nomForm;
    }

    public Date getDateDebutForm() {
        return dateDebutForm;
    }

    public void setDateDebutForm(Date dateDebutForm) {
        this.dateDebutForm = dateDebutForm;
    }

    public Date getDateFinForm() {
        return dateFinForm;
    }

    public void setDateFinForm(Date dateFinForm) {
        this.dateFinForm = dateFinForm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
}
