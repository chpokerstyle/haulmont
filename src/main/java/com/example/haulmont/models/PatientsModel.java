package com.example.haulmont.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "patients")
public class PatientsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long p_id;
    String p_name;
    String p_family;
    String p_patronymic;
    String p_number;

   // public List<RecipesModel>recipesModelList;

    public PatientsModel() {
    }

    @Override
    public String toString() {
        return "PatientsModel{" +
                "p_id=" + p_id +
                ", p_firstName='" + p_name + '\'' +
                ", p_lastName='" + p_family + '\'' +
                ", p_patronymic='" + p_patronymic + '\'' +
                ", p_number='" + p_number + '\'' +
                '}';
    }

    public Long getP_id() {
        return p_id;
    }

    public void setP_id(Long p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_family() {
        return p_family;
    }

    public void setP_family(String p_family) {
        this.p_family = p_family;
    }

    public String getP_patronymic() {
        return p_patronymic;
    }

    public void setP_patronymic(String p_patronymic) {
        this.p_patronymic = p_patronymic;
    }

    public String getP_number() {
        return p_number;
    }

    public void setP_number(String p_number) {
        this.p_number = p_number;
    }

    public PatientsModel(Long p_id, String p_name, String p_family, String p_patronymic, String p_number
           // ,List<RecipesModel> recipesModelList, List<DoctorsModel> doctorsModelsList
    ) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_family = p_family;
        this.p_patronymic = p_patronymic;
        this.p_number = p_number;
        //this.recipesModelList = recipesModelList;
      //  this.doctorsModelsList = doctorsModelsList;
    }
}
