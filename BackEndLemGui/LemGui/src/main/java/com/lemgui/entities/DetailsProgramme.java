package com.lemgui.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class DetailsProgramme {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idDetailsProgramme;
    private int periode;
    private int etat;
    private Date daterRealisation;
    private long coutPrevisionnel;
    private long coutReel;
    @ManyToOne
    @JoinColumn(name="ID_Activite")
    private Activite activite;

    @ManyToOne
    @JoinColumn(name="ID_Lieu")
    private Lieu lieu;

    @OneToMany(mappedBy ="detailsProgramme", fetch = FetchType.LAZY)
    private List<ActiviteCible> activiteCibles;
    @OneToMany(mappedBy ="detailsProgramme", fetch = FetchType.LAZY)
    private List<ActiveIndicateur> activeIndicateurs;
    @OneToMany(mappedBy ="detailsProgramme", fetch = FetchType.LAZY)
    private List<ActiviteDomaine> activiteDomaines;
    @OneToMany(mappedBy ="detailsProgramme", fetch = FetchType.LAZY)
    private List<ActiviteTache> activiteTaches;
    @OneToMany(mappedBy ="detailsProgramme", fetch = FetchType.LAZY)
    private List<ActiviteCommission> activiteCommissions;

    public DetailsProgramme() {
    }

    public DetailsProgramme(long idDetailsProgramme, int periode, int etat, Date daterRealisation, long coutPrevisionnel, long coutReel, Activite activite, Lieu lieu) {
        this.idDetailsProgramme = idDetailsProgramme;
        this.periode = periode;
        this.etat = etat;
        this.daterRealisation = daterRealisation;
        this.coutPrevisionnel = coutPrevisionnel;
        this.coutReel = coutReel;
        this.activite = activite;
        this.lieu = lieu;
    }

    public long getIdDetailsProgramme() {
        return idDetailsProgramme;
    }

    public void setIdDetailsProgramme(long idDetailsProgramme) {
        this.idDetailsProgramme = idDetailsProgramme;
    }

    public int getPeriode() {
        return periode;
    }

    public void setPeriode(int periode) {
        this.periode = periode;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public Date getDaterRealisation() {
        return daterRealisation;
    }

    public void setDaterRealisation(Date daterRealisation) {
        this.daterRealisation = daterRealisation;
    }

    public long getCoutPrevisionnel() {
        return coutPrevisionnel;
    }

    public void setCoutPrevisionnel(long coutPrevisionnel) {
        this.coutPrevisionnel = coutPrevisionnel;
    }

    public long getCoutReel() {
        return coutReel;
    }

    public void setCoutReel(long coutReel) {
        this.coutReel = coutReel;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public List<ActiviteCible> getActiviteCibles() {
        return activiteCibles;
    }

    public void setActiviteCibles(List<ActiviteCible> activiteCibles) {
        this.activiteCibles = activiteCibles;
    }

    public List<ActiveIndicateur> getActiveIndicateurs() {
        return activeIndicateurs;
    }

    public void setActiveIndicateurs(List<ActiveIndicateur> activeIndicateurs) {
        this.activeIndicateurs = activeIndicateurs;
    }

    public List<ActiviteDomaine> getActiviteDomaines() {
        return activiteDomaines;
    }

    public void setActiviteDomaines(List<ActiviteDomaine> activiteDomaines) {
        this.activiteDomaines = activiteDomaines;
    }

    public List<ActiviteTache> getActiviteTaches() {
        return activiteTaches;
    }

    public void setActiviteTaches(List<ActiviteTache> activiteTaches) {
        this.activiteTaches = activiteTaches;
    }

    public List<ActiviteCommission> getActiviteCommissions() {
        return activiteCommissions;
    }

    public void setActiviteCommissions(List<ActiviteCommission> activiteCommissions) {
        this.activiteCommissions = activiteCommissions;
    }
}
