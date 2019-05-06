package com.lemgui.entities;

import javax.persistence.*;

import java.util.List;

@Entity
public class Activite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private int idActivite;
    private String nomActivite;
    private int etat;
    @ManyToOne
    @JoinColumn(name="ID_TypeActivite")
    private TypeActivite typeActivite;


    @OneToMany(mappedBy ="activite", fetch = FetchType.LAZY)
    private List<DetailsResActivite> detailsResActivites;

    @OneToMany(mappedBy ="activite", fetch = FetchType.LAZY)
    private List<DetailsProgramme> detailsProgrammes;

    public Activite() {
    }

    public Activite(String nomActivite, int etat, TypeActivite typeActivite) {
        this.nomActivite = nomActivite;
        this.etat = etat;
        this.typeActivite = typeActivite;
    }

    public int getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(int idActivite) {
        this.idActivite = idActivite;
    }

    public String getNomActivite() {
        return nomActivite;
    }

    public void setNomActivite(String nomActivite) {
        this.nomActivite = nomActivite;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public TypeActivite getTypeActivite() {
        return typeActivite;
    }

    public void setTypeActivite(TypeActivite typeActivite) {
        this.typeActivite = typeActivite;
    }

    public List<DetailsResActivite> getDetailsResActivites() {
        return detailsResActivites;
    }

    public void setDetailsResActivites(List<DetailsResActivite> detailsResActivites) {
        this.detailsResActivites = detailsResActivites;
    }

    public List<DetailsProgramme> getDetailsProgrammes() {
        return detailsProgrammes;
    }

    public void setDetailsProgrammes(List<DetailsProgramme> detailsProgrammes) {
        this.detailsProgrammes = detailsProgrammes;
    }
}
