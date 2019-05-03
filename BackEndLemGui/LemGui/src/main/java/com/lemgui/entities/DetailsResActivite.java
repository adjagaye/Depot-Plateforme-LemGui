package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class DetailsResActivite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idDetails;
    private long prixRessoucePrevu;
    private long prixRessouceReel;
    private int etat;
    @ManyToOne
    @JoinColumn(name="ID_Activite")
    private Activite activite;
    @ManyToOne
    @JoinColumn(name="ID_Ressource")
    private Ressource ressource;

    public DetailsResActivite() {
    }

    public DetailsResActivite(long prixRessoucePrevu, long prixRessouceReel, int etat, Activite activite, Ressource ressource) {
        this.prixRessoucePrevu = prixRessoucePrevu;
        this.prixRessouceReel = prixRessouceReel;
        this.etat = etat;
        this.activite = activite;
        this.ressource = ressource;
    }

    public long getIdDetails() {
        return idDetails;
    }

    public void setIdDetails(long idDetails) {
        this.idDetails = idDetails;
    }

    public long getPrixRessoucePrevu() {
        return prixRessoucePrevu;
    }

    public void setPrixRessoucePrevu(long prixRessoucePrevu) {
        this.prixRessoucePrevu = prixRessoucePrevu;
    }

    public long getPrixRessouceReel() {
        return prixRessouceReel;
    }

    public void setPrixRessouceReel(long prixRessouceReel) {
        this.prixRessouceReel = prixRessouceReel;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public Ressource getRessource() {
        return ressource;
    }

    public void setRessource(Ressource ressource) {
        this.ressource = ressource;
    }
}
