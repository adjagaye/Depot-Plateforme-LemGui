package com.lemgui.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadre {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY )
    private int idCadre;
    private String titre;
    private String iconeCadre;
    private String texte;
    private int etat;

    public Cadre() {
    }

    public Cadre(String titre, String iconeCadre, String texte, int etat) {
        this.titre = titre;
        this.iconeCadre = iconeCadre;
        this.texte = texte;
        this.etat = etat;
    }

    public int getIdCadre() {
        return idCadre;
    }

    public void setIdCadre(int idCadre) {
        this.idCadre = idCadre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}
