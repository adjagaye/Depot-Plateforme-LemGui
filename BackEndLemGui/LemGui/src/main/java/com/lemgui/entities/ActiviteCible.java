package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class ActiviteCible {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idActiviteCible;
    @ManyToOne
    @JoinColumn(name="ID_Cible")
    private Cible cible;

    @ManyToOne
    @JoinColumn(name="ID_DetailsProgramme")
    private DetailsProgramme detailsProgramme;

}
