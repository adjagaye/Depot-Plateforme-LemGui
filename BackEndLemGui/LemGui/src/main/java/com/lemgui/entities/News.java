package com.lemgui.entities;

import javax.persistence.*;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idNews;
    private String imageNews;
    private String descriptionNews;
    private String auteur;

    @ManyToOne
    @JoinColumn(name="ID_TypeNews")
    private TypeNews typeNews;

    public News() {
    }

    public News(String imageNews, String descriptionNews, String auteur,  TypeNews typeNews) {
        this.imageNews = imageNews;
        this.descriptionNews = descriptionNews;
        this.auteur = auteur;
        this.typeNews = typeNews;
    }

    public long getIdNews() {
        return idNews;
    }

    public void setIdNews(long idNews) {
        this.idNews = idNews;
    }

    public String getImageNews() {
        return imageNews;
    }

    public void setImageNews(String imageNews) {
        this.imageNews = imageNews;
    }

    public String getDescriptionNews() {
        return descriptionNews;
    }

    public void setDescriptionNews(String descriptionNews) {
        this.descriptionNews = descriptionNews;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public TypeNews getTypeNews() {
        return typeNews;
    }

    public void setTypeNews(TypeNews typeNews) {
        this.typeNews = typeNews;
    }
}
