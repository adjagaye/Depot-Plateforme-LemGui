package com.lemgui.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idEvenement;
    private String iconeEvenement;
    private int nbjourRestant;
    private int etat;


    public Evenement() {
    }

    public Evenement(String iconeEvenement, int nbjourRestant, int etat) {
        this.iconeEvenement = iconeEvenement;
        this.nbjourRestant = nbjourRestant;
        this.etat = etat;
    }

    public long getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(long idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getIconeEvenement() {
        return iconeEvenement;
    }

    public void setIconeEvenement(String iconeEvenement) {
        this.iconeEvenement = iconeEvenement;
    }

    public int getNbjourRestant() {
        return nbjourRestant;
    }

    public void setNbjourRestant(int nbjourRestant) {
        this.nbjourRestant = nbjourRestant;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
