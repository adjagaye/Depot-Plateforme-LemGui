package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Poste {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idPoste;
    private String libellePoste;
    private int etat;
    @OneToMany(mappedBy ="poste", fetch = FetchType.LAZY)
    private List<DetailsBureau> detailsBureaux;

    public Poste() {
    }

    public Poste(String libellePoste, int etat) {
        this.libellePoste = libellePoste;
        this.etat = etat;
    }

    public long getIdPoste() {
        return idPoste;
    }

    public void setIdPoste(long idPoste) {
        this.idPoste = idPoste;
    }

    public String getLibellePoste() {
        return libellePoste;
    }

    public void setLibellePoste(String libellePoste) {
        this.libellePoste = libellePoste;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public List<DetailsBureau> getDetailsBureaux() {
        return detailsBureaux;
    }

    public void setDetailsBureaux(List<DetailsBureau> detailsBureaux) {
        this.detailsBureaux = detailsBureaux;
    }
}
