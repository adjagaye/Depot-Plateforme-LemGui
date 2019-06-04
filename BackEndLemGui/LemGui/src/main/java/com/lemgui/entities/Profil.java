package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Profil {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idProfil;
    private String libelleProfil;


    public Profil() {
    }

    public Profil(String libelleProfil) {
        this.libelleProfil = libelleProfil;
    }

    public long getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(long idProfil) {
        this.idProfil = idProfil;
    }

    public String getLibelleProfil() {
        return libelleProfil;
    }

    public void setLibelleProfil(String libelleProfil) {
        this.libelleProfil = libelleProfil;
    }
    
}
