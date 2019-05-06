package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Donateur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idDonateur;
    private String nomDonateur;
    private String adresse;
    private String email;
    private String adressFacebook;
    private String adresstwitter;
    private String adresstlinkedin;
    private String adressPinterest;
    @ManyToOne
    @JoinColumn(name="ID_TypeDonateur")
    private TypeDonateur typeDonateur;
    private String statut;

    @OneToMany(mappedBy ="donateur", fetch = FetchType.LAZY)
    private List<Dons> dons;
    @OneToMany(mappedBy ="donateur", fetch = FetchType.LAZY)
    private List<ActiviteTache> activiteTaches;

    public Donateur() {
    }

    public Donateur(String nomDonateur, String adresse, String email, String adressFacebook, String adresstwitter, String adresstlinkedin, String adressPinterest, TypeDonateur typeDonateur,String statut) {
        this.nomDonateur = nomDonateur;
        this.adresse = adresse;
        this.email = email;
        this.adressFacebook = adressFacebook;
        this.adresstwitter = adresstwitter;
        this.adresstlinkedin = adresstlinkedin;
        this.adressPinterest = adressPinterest;
        this.typeDonateur = typeDonateur;
    }

    public long getIdDonateur() {
        return idDonateur;
    }

    public void setIdDonateur(long idDonateur) {
        this.idDonateur = idDonateur;
    }

    public String getNomDonateur() {
        return nomDonateur;
    }

    public void setNomDonateur(String nomDonateur) {
        this.nomDonateur = nomDonateur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdressFacebook() {
        return adressFacebook;
    }

    public void setAdressFacebook(String adressFacebook) {
        this.adressFacebook = adressFacebook;
    }

    public String getAdresstwitter() {
        return adresstwitter;
    }

    public void setAdresstwitter(String adresstwitter) {
        this.adresstwitter = adresstwitter;
    }

    public String getAdresstlinkedin() {
        return adresstlinkedin;
    }

    public void setAdresstlinkedin(String adresstlinkedin) {
        this.adresstlinkedin = adresstlinkedin;
    }

    public String getAdressPinterest() {
        return adressPinterest;
    }

    public void setAdressPinterest(String adressPinterest) {
        this.adressPinterest = adressPinterest;
    }

    public TypeDonateur getTypeDonateur() {
        return typeDonateur;
    }

    public void setTypeDonateur(TypeDonateur typeDonateur) {
        this.typeDonateur = typeDonateur;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
