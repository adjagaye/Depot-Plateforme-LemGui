package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ressource {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idRessource;
    private String nomRessource;
    private int etat;
    @OneToMany(mappedBy ="ressource", fetch = FetchType.LAZY)
    private List<DetailsResActivite> detailsResActivites;

}
