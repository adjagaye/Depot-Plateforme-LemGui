package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class DetailsBureau {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idDetailsBureau;

    @ManyToOne
    @JoinColumn(name="ID_Poste")
    private Poste poste;

    @ManyToOne
    @JoinColumn(name="ID_Membre")
    private Membre membre;
    @ManyToOne
    @JoinColumn(name="ID_Bureau")
    private Bureau bureau;

    public DetailsBureau() {
    }

    public DetailsBureau(Poste poste, Membre membre,Bureau bureau) {
        this.poste = poste;
        this.membre = membre;
        this.bureau = bureau;
    }


    public long getIdDetailsBureau() {
        return idDetailsBureau;
    }

    public void setIdDetailsBureau(long idDetailsBureau) {
        this.idDetailsBureau = idDetailsBureau;
    }

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }
}
