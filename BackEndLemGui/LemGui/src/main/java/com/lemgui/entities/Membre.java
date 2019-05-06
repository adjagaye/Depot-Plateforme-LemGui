package com.lemgui.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Membre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idMembre;
    private String nomMembre;
    private long tel;
    private String numeroCarte;
    private Date dateAdhesion;
    private int etat;

    @ManyToOne
    @JoinColumn(name="ID_TypeMembre")
    private TypeMembre typeMembre;

    @OneToMany(mappedBy ="membre", fetch = FetchType.LAZY)
    private List<MembreCommission> membreCommissions;
    @OneToMany(mappedBy ="membre", fetch = FetchType.LAZY)
    private List<DetailsBureau> detailsBureaux;

    public Membre() {
    }

    public Membre(String nomMembre, long tel, String numeroCarte, Date dateAdhesion, int etat, TypeMembre typeMembre) {
        this.nomMembre = nomMembre;
        this.tel = tel;
        this.numeroCarte = numeroCarte;
        this.dateAdhesion = dateAdhesion;
        this.etat = etat;
        this.typeMembre = typeMembre;
    }

    public long getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(long idMembre) {
        this.idMembre = idMembre;
    }

    public String getNomMembre() {
        return nomMembre;
    }

    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public Date getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public TypeMembre getTypeMembre() {
        return typeMembre;
    }

    public void setTypeMembre(TypeMembre typeMembre) {
        this.typeMembre = typeMembre;
    }

    public List<MembreCommission> getMembreCommissions() {
        return membreCommissions;
    }

    public void setMembreCommissions(List<MembreCommission> membreCommissions) {
        this.membreCommissions = membreCommissions;
    }

    public List<DetailsBureau> getDetailsBureaux() {
        return detailsBureaux;
    }

    public void setDetailsBureaux(List<DetailsBureau> detailsBureaux) {
        this.detailsBureaux = detailsBureaux;
    }
}
