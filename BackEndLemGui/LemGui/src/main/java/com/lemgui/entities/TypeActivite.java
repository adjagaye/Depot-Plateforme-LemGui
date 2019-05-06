package com.lemgui.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class TypeActivite {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idTypeActivite;
    private String libelleActivite;
    private String etat;
    @OneToMany(mappedBy ="typeActivite", fetch = FetchType.LAZY)
    private List<Activite> activites;

    public TypeActivite() {
    }

    public TypeActivite(String libelleActivite, String etat, List<Activite> activites) {
        this.libelleActivite = libelleActivite;
        this.etat = etat;
        this.activites = activites;
    }

    public long getIdTypeActivite() {
        return idTypeActivite;
    }

    public void setIdTypeActivite(long idTypeActivite) {
        this.idTypeActivite = idTypeActivite;
    }

    public String getLibelleActivite() {
        return libelleActivite;
    }

    public void setLibelleActivite(String libelleActivite) {
        this.libelleActivite = libelleActivite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public List<Activite> getActivites() {
        return activites;
    }

    public void setActivites(List<Activite> activites) {
        this.activites = activites;
    }
}
