package com.develhope.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Movie {
    private  int id;
    private  String titolo;
    private  int anno;

    public Movie(int id, String titolo, int anno) {
        this.id = id;
        this.titolo = titolo;
        this.anno = anno;
    }
   @JsonIgnore
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
}
//public  record Movie(int id, String titolo ,int anno) {
//
//}