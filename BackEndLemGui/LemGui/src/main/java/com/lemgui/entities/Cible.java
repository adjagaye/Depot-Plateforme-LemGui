package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cible {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idCible;
    private String nomCible;
    @OneToMany(mappedBy ="cible", fetch = FetchType.LAZY)
    private List<ActiviteCible> activiteCibles;

    public Cible() {
    }

    public Cible(String nomCible) {
        this.nomCible = nomCible;
    }

    public long getIdCible() {
        return idCible;
    }

    public void setIdCible(long idCible) {
        this.idCible = idCible;
    }

    public String getNomCible() {
        return nomCible;
    }

    public void setNomCible(String nomCible) {
        this.nomCible = nomCible;
    }

    public List<ActiviteCible> getActiviteCibles() {
        return activiteCibles;
    }

    public void setActiviteCibles(List<ActiviteCible> activiteCibles) {
        this.activiteCibles = activiteCibles;
    }
}
