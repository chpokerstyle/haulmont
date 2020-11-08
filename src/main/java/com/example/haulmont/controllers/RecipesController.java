package com.example.haulmont.controllers;

import com.example.haulmont.dto.RecipesDTO;
import com.example.haulmont.models.RecipeEntity;
import com.example.haulmont.servises.RecipesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
public class RecipesController {
    private final RecipesService recipesService;

    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }


    @GetMapping("/")
    public Iterable<RecipeEntity> recipesAll (RecipesDTO recipesDTO){
        return recipesService.recipesFindAll();
    }

    @PostMapping("/save")
    public RecipesDTO saveRecipe(RecipesDTO recipesDTO){
        return recipesService.saveRecipes(recipesDTO);
    }
}
