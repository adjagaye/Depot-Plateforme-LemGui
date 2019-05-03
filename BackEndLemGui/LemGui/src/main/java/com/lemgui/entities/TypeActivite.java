package com.lemgui.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class TypeActivite {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idTypeActivite;
    private String libelleActivite;
    private String etat;
    @OneToMany(mappedBy ="typeActivite", fetch = FetchType.LAZY)
    private List<Activite> activites;


}
