package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class ActiviteTache {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idActiviteTache;
    private long but;
    private long atteint;
    private long coutPrevisionnel;
    private long Reel;
    @ManyToOne
    @JoinColumn(name="ID_DetailsProgramme")
    private DetailsProgramme detailsProgramme;
    @ManyToOne
    @JoinColumn(name="ID_Commission")
    private Commission commission;
    @ManyToOne
    @JoinColumn(name="ID_Donateur")
    private Donateur donateur;
    @ManyToOne
    @JoinColumn(name="ID_Ressource")
    private Ressource ressource;
    @ManyToOne
    @JoinColumn(name="ID_Tache")
    private Taches tache;

}

