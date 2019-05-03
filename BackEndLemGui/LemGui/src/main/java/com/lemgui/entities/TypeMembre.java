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
}
