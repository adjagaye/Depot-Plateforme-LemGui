package com.lemgui.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Activite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private int idActivvite;
    private Date dateActivite;
    private String lieuActivite;
    private Date heureActivite;
    private String cible;
    private long montantprev;
    private int etat;
    @ManyToOne
    @JoinColumn(name="ID_TypeActivite")
    private TypeActivite typeActivite;
    @ManyToOne
    @JoinColumn(name="ID_Domaine")
    private Domaine domaine;

    @OneToMany(mappedBy ="activite", fetch = FetchType.LAZY)
    private List<DetailsResActivite> detailsResActivites;

    public Activite() {
    }

    public Activite(Date dateActivite, String lieuActivite, Date heureActivite, String cible, long montantprev, int etat, TypeActivite typeActivite, Domaine domaine) {
        this.dateActivite = dateActivite;
        this.lieuActivite = lieuActivite;
        this.heureActivite = heureActivite;
        this.cible = cible;
        this.montantprev = montantprev;
        this.etat = etat;
        this.typeActivite = typeActivite;
        this.domaine = domaine;
    }

    public int getIdActivvite() {
        return idActivvite;
    }

    public void setIdActivvite(int idActivvite) {
        this.idActivvite = idActivvite;
    }

    public Date getDateActivite() {
        return dateActivite;
    }

    public void setDateActivite(Date dateActivite) {
        this.dateActivite = dateActivite;
    }

    public String getLieuActivite() {
        return lieuActivite;
    }

    public void setLieuActivite(String lieuActivite) {
        this.lieuActivite = lieuActivite;
    }

    public Date getHeureActivite() {
        return heureActivite;
    }

    public void setHeureActivite(Date heureActivite) {
        this.heureActivite = heureActivite;
    }

    public String getCible() {
        return cible;
    }

    public void setCible(String cible) {
        this.cible = cible;
    }

    public long getMontantprev() {
        return montantprev;
    }

    public void setMontantprev(long montantprev) {
        this.montantprev = montantprev;
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

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public List<DetailsResActivite> getDetailsResActivites() {
        return detailsResActivites;
    }

    public void setDetailsResActivites(List<DetailsResActivite> detailsResActivites) {
        this.detailsResActivites = detailsResActivites;
    }
}
