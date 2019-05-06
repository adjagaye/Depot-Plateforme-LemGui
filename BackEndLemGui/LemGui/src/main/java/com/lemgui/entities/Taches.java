package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Taches {
    @Id
@GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idTache;
    private String libelleTache;
    @OneToMany(mappedBy ="taches", fetch = FetchType.LAZY)
    private List<ActiviteTache> activiteTaches;


    public Taches() {
    }

    public Taches(String libelleTache) {
        this.libelleTache = libelleTache;
    }

    public long getIdTache() {
        return idTache;
    }

    public void setIdTache(long idTache) {
        this.idTache = idTache;
    }

    public String getLibelleTache() {
        return libelleTache;
    }

    public void setLibelleTache(String libelleTache) {
        this.libelleTache = libelleTache;
    }

    public List<ActiviteTache> getActiviteTaches() {
        return activiteTaches;
    }

    public void setActiviteTaches(List<ActiviteTache> activiteTaches) {
        this.activiteTaches = activiteTaches;
    }
}
