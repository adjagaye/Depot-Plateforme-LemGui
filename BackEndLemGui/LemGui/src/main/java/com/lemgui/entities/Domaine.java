package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Domaine {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idDomaine;
    private String imageDomaine;
    private String valprogressbar;
    private String nomDomaine;
    private int realisation;
    private int but;
    private String descriptionDomaine;
    private int etat;

    @OneToMany(mappedBy ="domaine", fetch = FetchType.LAZY)
    private List<Activite> activites;

    public Domaine() {
    }

    public Domaine(String imageDomaine, String valprogressbar, String nomDomaine, int realisation, int but, String descriptionDomaine, int etat) {
        this.imageDomaine = imageDomaine;
        this.valprogressbar = valprogressbar;
        this.nomDomaine = nomDomaine;
        this.realisation = realisation;
        this.but = but;
        this.descriptionDomaine = descriptionDomaine;
        this.etat = etat;
    }

    public long getIdDomaine() {
        return idDomaine;
    }

    public void setIdDomaine(long idDomaine) {
        this.idDomaine = idDomaine;
    }

    public String getImageDomaine() {
        return imageDomaine;
    }

    public void setImageDomaine(String imageDomaine) {
        this.imageDomaine = imageDomaine;
    }

    public String getValprogressbar() {
        return valprogressbar;
    }

    public void setValprogressbar(String valprogressbar) {
        this.valprogressbar = valprogressbar;
    }

    public String getNomDomaine() {
        return nomDomaine;
    }

    public void setNomDomaine(String nomDomaine) {
        this.nomDomaine = nomDomaine;
    }

    public int getRealisation() {
        return realisation;
    }

    public void setRealisation(int realisation) {
        this.realisation = realisation;
    }

    public int getBut() {
        return but;
    }

    public void setBut(int but) {
        this.but = but;
    }

    public String getDescriptionDomaine() {
        return descriptionDomaine;
    }

    public void setDescriptionDomaine(String descriptionDomaine) {
        this.descriptionDomaine = descriptionDomaine;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public List<Activite> getActivites() {
        return activites;
    }

    public void setActivites(List<Activite> activites) {
        this.activites = activites;
    }
}
