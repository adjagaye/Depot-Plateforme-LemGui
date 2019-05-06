package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Lieu {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idLieu;
    private String nomLieu;
    @OneToMany(mappedBy ="lieu", fetch = FetchType.LAZY)
    private List<DetailsProgramme> detailsProgrammes;

    public Lieu() {
    }

    public Lieu(long idLieu, String nomLieu) {
        this.idLieu = idLieu;
        this.nomLieu = nomLieu;
    }

    public long getIdLieu() {
        return idLieu;
    }

    public void setIdLieu(long idLieu) {
        this.idLieu = idLieu;
    }

    public String getNomLieu() {
        return nomLieu;
    }

    public void setNomLieu(String nomLieu) {
        this.nomLieu = nomLieu;
    }

    public List<DetailsProgramme> getDetailsProgrammes() {
        return detailsProgrammes;
    }

    public void setDetailsProgrammes(List<DetailsProgramme> detailsProgrammes) {
        this.detailsProgrammes = detailsProgrammes;
    }
}
