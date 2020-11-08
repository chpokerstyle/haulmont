package com.example.haulmont.repositories;

import com.example.haulmont.models.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatientsRepository extends CrudRepository<PatientEntity, Long> {
}
