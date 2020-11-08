package com.example.haulmont.repositories;

import com.example.haulmont.models.DoctorsModel;
import com.example.haulmont.models.RecipesModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipesRepository extends CrudRepository<RecipesModel, Long> {
}
