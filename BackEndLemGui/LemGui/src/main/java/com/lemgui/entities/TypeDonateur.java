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
}
