package com.example.haulmont.repositories;

import com.example.haulmont.models.DoctorsModel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorsRepository extends CrudRepository<DoctorsModel, Long> {

}
