package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeMembre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idTypeMembre;
    private String libelleType;
    @OneToMany(mappedBy ="typeMembre", fetch = FetchType.LAZY)
    private List<Membre> membres;

    public TypeMembre() {
    }

    public TypeMembre(String libelleType) {
        this.libelleType = libelleType;
    }

    public long getIdTypeMembre() {
        return idTypeMembre;
    }

    public void setIdTypeMembre(long idTypeMembre) {
        this.idTypeMembre = idTypeMembre;
    }

    public String getLibelleType() {
        return libelleType;
    }

    public void setLibelleType(String libelleType) {
        this.libelleType = libelleType;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }
}
