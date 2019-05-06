package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class DetailsBureau {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idBureau;

    @ManyToOne
    @JoinColumn(name="ID_Poste")
    private Poste poste;

    @ManyToOne
    @JoinColumn(name="ID_Membre")
    private Membre membre;

    public DetailsBureau() {
    }

    public DetailsBureau(Poste poste, Membre membre) {
        this.poste = poste;
        this.membre = membre;
    }

    public long getIdBureau() {
        return idBureau;
    }

    public void setIdBureau(long idBureau) {
        this.idBureau = idBureau;
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
