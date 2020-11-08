package com.example.haulmont.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "doctors")
public class DoctorsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long dId;
    String d_family;
    String d_name;
    String d_patronymic;
    String specialization;

    @OneToMany(mappedBy = "doctors_id")
    private Set<RecipesModel> recipesModelList;

    public Set<RecipesModel> getRecipesModelList() {
        return recipesModelList;
    }

    public void setRecipesModelList(Set<RecipesModel> recipesModelList) {
        this.recipesModelList = recipesModelList;
    }

    public DoctorsModel() {
    }

    public DoctorsModel(Long dId, String d_name, String d_family, String d_patronymic, String specialization     ) {
        this.dId = dId;
        this.d_name = d_name;
        this.d_family = d_family;
        this.d_patronymic = d_patronymic;
        this.specialization = specialization;
    }

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public String getD_family() {
        return d_family;
    }

    public void setD_family(String d_family) {
        this.d_family = d_family;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_patronymic() {
        return d_patronymic;
    }

    public void setD_patronymic(String d_patronymic) {
        this.d_patronymic = d_patronymic;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
