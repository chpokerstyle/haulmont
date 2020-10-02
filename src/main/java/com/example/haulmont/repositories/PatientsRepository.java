package com.example.haulmont.repositories;

import com.example.haulmont.models.PatientsModel;
import org.springframework.data.repository.CrudRepository;

public interface PatientsRepository extends CrudRepository<PatientsModel, Long> {
}
