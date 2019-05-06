package com.lemgui.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeNews {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idTypeNews;
    private String libTypeNews;
    private int etat;

    @OneToMany(mappedBy ="typeNews", fetch = FetchType.LAZY)
    private List<News> news;


    public TypeNews() {
    }

    public TypeNews(String libTypeNews, int etat) {
        this.libTypeNews = libTypeNews;
        this.etat = etat;
    }

    public long getIdTypeNews() {
        return idTypeNews;
    }

    public void setIdTypeNews(long idTypeNews) {
        this.idTypeNews = idTypeNews;
    }

    public String getLibTypeNews() {
        return libTypeNews;
    }

    public void setLibTypeNews(String libTypeNews) {
        this.libTypeNews = libTypeNews;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
