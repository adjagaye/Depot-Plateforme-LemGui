package com.lemgui.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Bureau {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idBureau;
    private Date dateDbMandat;
    private Date dateFinMandat;
    private String encours;
    @OneToMany(mappedBy ="bureau", fetch = FetchType.LAZY)
    private List<DetailsBureau> detailsBureaux;

    public Bureau() {
    }

    public Bureau(Date dateDbMandat, Date dateFinMandat, String encours) {
        this.dateDbMandat = dateDbMandat;
        this.dateFinMandat = dateFinMandat;
        this.encours = encours;
    }

    public long getIdBureau() {
        return idBureau;
    }

    public void setIdBureau(long idBureau) {
        this.idBureau = idBureau;
    }

    public Date getDateDbMandat() {
        return dateDbMandat;
    }

    public void setDateDbMandat(Date dateDbMandat) {
        this.dateDbMandat = dateDbMandat;
    }

    public Date getDateFinMandat() {
        return dateFinMandat;
    }

    public void setDateFinMandat(Date dateFinMandat) {
        this.dateFinMandat = dateFinMandat;
    }

    public String getEncours() {
        return encours;
    }

    public void setEncours(String encours) {
        this.encours = encours;
    }

    public List<DetailsBureau> getDetailsBureaux() {
        return detailsBureaux;
    }

    public void setDetailsBureaux(List<DetailsBureau> detailsBureaux) {
        this.detailsBureaux = detailsBureaux;
    }
}
