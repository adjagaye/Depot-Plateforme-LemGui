package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Indicateurs {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idIndicateur;
    private String nomIndicateur;
    @OneToMany(mappedBy ="indicateurs", fetch = FetchType.LAZY)
    private List<ActiveIndicateur> activeIndicateurs;

    public Indicateurs() {
    }

    public Indicateurs(String nomIndicateur) {
        this.nomIndicateur = nomIndicateur;
    }

    public long getIdIndicateur() {
        return idIndicateur;
    }

    public void setIdIndicateur(long idIndicateur) {
        this.idIndicateur = idIndicateur;
    }

    public String getNomIndicateur() {
        return nomIndicateur;
    }

    public void setNomIndicateur(String nomIndicateur) {
        this.nomIndicateur = nomIndicateur;
    }

    public List<ActiveIndicateur> getActiveIndicateurs() {
        return activeIndicateurs;
    }

    public void setActiveIndicateurs(List<ActiveIndicateur> activeIndicateurs) {
        this.activeIndicateurs = activeIndicateurs;
    }
}
