package com.lemgui.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commission {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private int idCommission;
    private String nomCommission;
    private String nomPresident;
    private long telPresident;
    private String email;
    private int etat;

    public Commission() {
    }

    public Commission(String nomCommission, String nomPresident, long telPresident, String email, int etat) {
        this.nomCommission = nomCommission;
        this.nomPresident = nomPresident;
        this.telPresident = telPresident;
        this.email = email;
        this.etat = etat;
    }

    public int getIdCommission() {
        return idCommission;
    }

    public void setIdCommission(int idCommission) {
        this.idCommission = idCommission;
    }

    public String getNomCommission() {
        return nomCommission;
    }

    public void setNomCommission(String nomCommission) {
        this.nomCommission = nomCommission;
    }

    public String getNomPresident() {
        return nomPresident;
    }

    public void setNomPresident(String nomPresident) {
        this.nomPresident = nomPresident;
    }

    public long getTelPresident() {
        return telPresident;
    }

    public void setTelPresident(long telPresident) {
        this.telPresident = telPresident;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
