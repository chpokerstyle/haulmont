package com.example.haulmont.servises;

import com.example.haulmont.dto.RecipesDTO;
import com.example.haulmont.models.RecipesModel;

public interface RecipesService {
    Iterable<RecipesModel> recipesFindAll();
    void deleteRecipes(Long id);
    RecipesDTO saveRecipes(RecipesDTO recipesDTO);
    RecipesDTO editRecipes(RecipesDTO recipesDTO);
}
