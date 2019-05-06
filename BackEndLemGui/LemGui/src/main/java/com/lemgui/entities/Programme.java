package com.lemgui.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Programme {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idProgramme;
    private Date dateDebut;
    private Date dateFin;
    private int annee;
    private int etat;

    public Programme() {
    }

    public Programme(Date dateDebut, Date dateFin, int annee, int etat) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.annee = annee;
        this.etat = etat;
    }

    public long getIdProgramme() {
        return idProgramme;
    }

    public void setIdProgramme(long idProgramme) {
        this.idProgramme = idProgramme;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
