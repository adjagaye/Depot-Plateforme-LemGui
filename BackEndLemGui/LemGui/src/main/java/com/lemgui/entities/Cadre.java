package com.lemgui.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadre {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY )
    private int cadre;
    private String nomCadre;
    private String iconeCadre;
    private int etat;

    public Cadre() {
    }

    public Cadre(String nomCadre, String iconeCadre, int etat) {
        this.nomCadre = nomCadre;
        this.iconeCadre = iconeCadre;
        this.etat = etat;
    }

    public int getCadre() {
        return cadre;
    }

    public void setCadre(int cadre) {
        this.cadre = cadre;
    }

    public String getNomCadre() {
        return nomCadre;
    }

    public void setNomCadre(String nomCadre) {
        this.nomCadre = nomCadre;
    }

    public String getIconeCadre() {
        return iconeCadre;
    }

    public void setIconeCadre(String iconeCadre) {
        this.iconeCadre = iconeCadre;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
