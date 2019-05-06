package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class ActiviteDomaine {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idActiviteDomaine;
    @ManyToOne
    @JoinColumn(name="ID_DetailsProgramme")
    private DetailsProgramme detailsProgramme;
    @ManyToOne
    @JoinColumn(name="ID_Domaine")
    private Domaine domaine;

    public ActiviteDomaine() {
    }

    public ActiviteDomaine(DetailsProgramme detailsProgramme, Domaine domaine) {
        this.detailsProgramme = detailsProgramme;
        this.domaine = domaine;
    }

    public long getIdActiviteDomaine() {
        return idActiviteDomaine;
    }

    public void setIdActiviteDomaine(long idActiviteDomaine) {
        this.idActiviteDomaine = idActiviteDomaine;
    }

    public DetailsProgramme getDetailsProgramme() {
        return detailsProgramme;
    }

    public void setDetailsProgramme(DetailsProgramme detailsProgramme) {
        this.detailsProgramme = detailsProgramme;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }
}
