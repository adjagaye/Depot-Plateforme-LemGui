package com.lemgui.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idNews;
    private String imageNews;
    private String descriptionNews;
    private String auteur;

}
