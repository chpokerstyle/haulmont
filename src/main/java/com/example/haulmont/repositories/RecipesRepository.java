package com.example.haulmont.repositories;

import com.example.haulmont.models.RecipesModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipesRepository extends CrudRepository<RecipesModel, Long> {
}
