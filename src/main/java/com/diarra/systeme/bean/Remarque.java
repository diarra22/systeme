package com.diarra.systeme.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Remarque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String objetRemarque;
    private Date dateRemarque ;
    private String statusRemarque;
    public Remarque(){}


    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id", insertable = true, updatable = false)
    private User user;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "salleId", referencedColumnName = "id", insertable = true, updatable = false)
    private Salle salle;


}
