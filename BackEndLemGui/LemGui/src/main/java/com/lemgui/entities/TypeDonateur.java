package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeDonateur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idTypeDonateur;
    private String libelleDonateurs;
    @OneToMany(mappedBy ="typeDonateur", fetch = FetchType.LAZY)
    private List<Donateur> donateurs;

    public TypeDonateur() {
    }

    public TypeDonateur(String libelleDonateurs) {
        this.libelleDonateurs = libelleDonateurs;
    }

    public long getIdTypeDonateur() {
        return idTypeDonateur;
    }

    public void setIdTypeDonateur(long idTypeDonateur) {
        this.idTypeDonateur = idTypeDonateur;
    }

    public String getLibelleDonateurs() {
        return libelleDonateurs;
    }

    public void setLibelleDonateurs(String libelleDonateurs) {
        this.libelleDonateurs = libelleDonateurs;
    }

    public List<Donateur> getDonateurs() {
        return donateurs;
    }

    public void setDonateurs(List<Donateur> donateurs) {
        this.donateurs = donateurs;
    }
}
