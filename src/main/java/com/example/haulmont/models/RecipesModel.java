package com.example.haulmont.models;

import javax.persistence.*;

@Entity
@Table(name = "recipes")
public class RecipesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RecipesModel() {
    }

    public RecipesModel(Long id) {
        this.id = id;
    }
}
