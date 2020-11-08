package com.example.haulmont.controllers;

import com.example.haulmont.dto.RecipesDTO;
import com.example.haulmont.models.RecipesModel;
import com.example.haulmont.servises.RecipesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipesController {
    private final RecipesService recipesService;

    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }


    @GetMapping("/")
    public Iterable<RecipesModel> recipesAll (RecipesDTO recipesDTO){
        return recipesService.recipesFindAll();
    }

    @PostMapping("/save")
    public RecipesDTO saveRecipe(RecipesDTO recipesDTO){
        return recipesService.saveRecipes(recipesDTO);
    }
}
