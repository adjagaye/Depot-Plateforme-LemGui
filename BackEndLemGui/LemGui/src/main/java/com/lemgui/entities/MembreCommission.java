package com.lemgui.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MembreCommission {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idMembreCommission;
    private Date dateDebut;
    private Date dateFin;
    @ManyToOne
    @JoinColumn(name="ID_Membre")
    private Membre membre;

    public MembreCommission() {
    }

    public MembreCommission(Date dateDebut, Date dateFin, Membre membre) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.membre = membre;
    }

    public long getIdMembreCommission() {
        return idMembreCommission;
    }

    public void setIdMembreCommission(long idMembreCommission) {
        this.idMembreCommission = idMembreCommission;
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

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }
}
