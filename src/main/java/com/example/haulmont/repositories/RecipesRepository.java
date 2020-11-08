package com.example.haulmont.repositories;

import com.example.haulmont.models.RecipeEntity;
import org.springframework.data.repository.CrudRepository;

public interface RecipesRepository extends CrudRepository<RecipeEntity, Long> {
}
