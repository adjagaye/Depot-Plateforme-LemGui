package com.lemgui.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ActiviteCible {
    private long idActiviteCible;
    @ManyToOne
    @JoinColumn(name="ID_Cible")
    private Cible cible;

    @ManyToOne
    @JoinColumn(name="ID_DetailsProgramme")
    private DetailsProgramme detailsProgramme;

}
