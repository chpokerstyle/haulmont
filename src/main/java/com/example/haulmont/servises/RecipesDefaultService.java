package com.example.haulmont.servises;

import com.example.haulmont.converterDTO.ConverterRecipesDTO;
import com.example.haulmont.dto.RecipesDTO;
import com.example.haulmont.models.RecipesModel;
import com.example.haulmont.repositories.RecipesRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipesDefaultService implements RecipesService {
    
    private final RecipesRepository recipesRepository;
    private final ConverterRecipesDTO converterRecipesDTO;

    public RecipesDefaultService(RecipesRepository recipesRepository, ConverterRecipesDTO converterRecipesDTO) {
        this.recipesRepository = recipesRepository;
        this.converterRecipesDTO = converterRecipesDTO;
    }

    @Override
    public Iterable<RecipesModel> recipesFindAll() {
        return recipesRepository.findAll();
    } //возвращает всех пользователей из коллекции

    @Override
    public void deleteRecipes(Long id) {

    }//находит пользователя по id и удаляет

    @Override
    public RecipesDTO saveRecipes(RecipesDTO recipesDTO) {
        RecipesModel recipesModel = recipesRepository.save(converterRecipesDTO.fromRecipesDtoToRecipes(recipesDTO));
        return converterRecipesDTO.fromRecipesToRecipesDTO(recipesModel);
    }

    @Override
    public RecipesDTO editRecipes(RecipesDTO recipesDTO) {
        RecipesModel recipesModel = recipesRepository.save(converterRecipesDTO.fromRecipesDtoToRecipes(recipesDTO));
        return converterRecipesDTO.fromRecipesToRecipesDTO(recipesModel);
    }
}
