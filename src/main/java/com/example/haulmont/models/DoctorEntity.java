package com.example.haulmont.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "doctors")
@Data
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String specialization;
    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    private Set<RecipeEntity> recipes;
    @ManyToMany
    @JoinTable(
            schema = "public",
            name = "doctor_patient",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id")
    )
    private Set<PatientEntity> patients;
}
