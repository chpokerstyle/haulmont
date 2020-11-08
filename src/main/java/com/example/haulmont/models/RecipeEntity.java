package com.example.haulmont.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "recipes")
public class RecipeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date expiredDate;
    private String priority;
    @ManyToOne(targetEntity = DoctorEntity.class, fetch = FetchType.LAZY)
    private DoctorEntity doctor;
    @ManyToOne(targetEntity = PatientEntity.class, fetch = FetchType.LAZY)
    private PatientEntity patient;
}