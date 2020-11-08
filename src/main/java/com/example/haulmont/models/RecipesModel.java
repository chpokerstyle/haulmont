package com.example.haulmont.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipes")
public class RecipesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long r_id;
    @ManyToOne(targetEntity = DoctorsModel.class,fetch = FetchType.LAZY)
    Long doctors_id;
    Long patients_id;
    String description;
    String deadline;
    String priority;

    public RecipesModel() {
    }

    @Override
    public String toString() {
        return "RecipesModel{" +
                "r_id=" + r_id +
                ", doctors_id=" + doctors_id +
                ", patients_id=" + patients_id +
                ", description='" + description + '\'' +
                ", deadline='" + deadline + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }

    public Long getR_id() {
        return r_id;
    }

    public void setR_id(Long r_id) {
        this.r_id = r_id;
    }

    public Long getDoctors_id() {
        return doctors_id;
    }

    public void setDoctors_id(Long doctors_id) {
        this.doctors_id = doctors_id;
    }

    public Long getPatients_id() {
        return patients_id;
    }

    public void setPatients_id(Long patients_id) {
        this.patients_id = patients_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public RecipesModel(Long r_id, Long doctors_id, Long patients_id, String description, String deadline, String priority) {
        this.r_id = r_id;
        this.doctors_id = doctors_id;
        this.patients_id = patients_id;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
    }
}