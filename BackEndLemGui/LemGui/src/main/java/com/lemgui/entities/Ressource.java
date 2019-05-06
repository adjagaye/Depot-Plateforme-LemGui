package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ressource {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idRessource;
    private String nomRessource;
    private int etat;
    @OneToMany(mappedBy ="ressource", fetch = FetchType.LAZY)
    private List<ActiviteTache> activiteTaches;


    public Ressource() {
    }

    public Ressource(String nomRessource, int etat) {
        this.nomRessource = nomRessource;
        this.etat = etat;
    }

    public long getIdRessource() {
        return idRessource;
    }

    public void setIdRessource(long idRessource) {
        this.idRessource = idRessource;
    }

    public String getNomRessource() {
        return nomRessource;
    }

    public void setNomRessource(String nomRessource) {
        this.nomRessource = nomRessource;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public List<ActiviteTache> getActiviteTaches() {
        return activiteTaches;
    }

    public void setActiviteTaches(List<ActiviteTache> activiteTaches) {
        this.activiteTaches = activiteTaches;
    }
}
