package com.lemgui.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class TypeMembre  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idTypeMembre;
    private String libelleType;

    @JsonBackReference
    @OneToMany(mappedBy ="typeMembre")
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
