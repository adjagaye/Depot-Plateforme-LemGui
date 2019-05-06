package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class ActiveIndicateur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idActiveIndicateur;
    private long but;
    private long atteint;
    @ManyToOne
    @JoinColumn(name="ID_Indicateur")
    private Indicateurs indicateurs;
    @ManyToOne
    @JoinColumn(name="ID_DetailsProgramme")
    private DetailsProgramme detailsProgramme;

}
