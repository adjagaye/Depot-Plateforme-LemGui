package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class ActiviteCommission {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idActiviteCommission;
    @ManyToOne
    @JoinColumn(name="ID_DetailsProgramme")
    private DetailsProgramme detailsProgramme;
    @ManyToOne
    @JoinColumn(name="ID_Commission")
    private Commission commission;

    public ActiviteCommission() {
    }

    public ActiviteCommission(DetailsProgramme detailsProgramme, Commission commission) {
        this.detailsProgramme = detailsProgramme;
        this.commission = commission;
    }

    public long getIdActiviteCommission() {
        return idActiviteCommission;
    }

    public void setIdActiviteCommission(long idActiviteCommission) {
        this.idActiviteCommission = idActiviteCommission;
    }

    public DetailsProgramme getDetailsProgramme() {
        return detailsProgramme;
    }

    public void setDetailsProgramme(DetailsProgramme detailsProgramme) {
        this.detailsProgramme = detailsProgramme;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }
}
