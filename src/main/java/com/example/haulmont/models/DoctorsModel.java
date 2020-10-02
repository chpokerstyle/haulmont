package com.example.haulmont.models;

import javax.persistence.*;

@Entity
@Table(name = "doctors")
public class DoctorsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long d_id;
    String d_family;
    String d_name;
    String d_patronymic;
    String specialization;

    public DoctorsModel() {
    }

    public DoctorsModel(Long d_id, String d_name, String d_family, String d_patronymic, String specialization) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_family = d_family;
        this.d_patronymic = d_patronymic;
        this.specialization = specialization;
    }

    public Long getD_id() {
        return d_id;
    }

    public void setD_id(Long d_id) {
        this.d_id = d_id;
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
