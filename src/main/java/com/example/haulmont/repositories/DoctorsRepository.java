package com.example.haulmont.repositories;

import com.example.haulmont.models.DoctorEntity;
import org.springframework.data.repository.CrudRepository;

public interface DoctorsRepository extends CrudRepository<DoctorEntity, Long> {

}
