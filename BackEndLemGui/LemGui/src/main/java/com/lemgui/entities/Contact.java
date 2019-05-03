package com.lemgui.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idContact;
    private String nom;
    private String prenom;
    private String telContact;
    private int etat;

    public Contact() {
    }

    public Contact(String nom, String prenom, String telContact, int etat) {
        this.nom = nom;
        this.prenom = prenom;
        this.telContact = telContact;
        this.etat = etat;
    }

    public long getIdContact() {
        return idContact;
    }

    public void setIdContact(long idContact) {
        this.idContact = idContact;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelContact() {
        return telContact;
    }

    public void setTelContact(String telContact) {
        this.telContact = telContact;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
