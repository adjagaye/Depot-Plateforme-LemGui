package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class Dons {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idDon;
    private String libelleDon;
    private int qteDon;
    @ManyToOne
    @JoinColumn(name="ID_Donateur")
    private Donateur donateur;
}
