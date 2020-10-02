package com.example.haulmont.converterDTO;


import com.example.haulmont.dto.RecipesDTO;
import com.example.haulmont.models.RecipesModel;
import org.springframework.stereotype.Component;

@Component
public class ConverterRecipesDTO {
    public RecipesModel fromRecipesDtoToRecipes(RecipesDTO rDTO){
    RecipesModel rm = new RecipesModel();
    rm.setId(rDTO.getId());
    return rm;
}
    public RecipesDTO fromRecipesToRecipesDTO(RecipesModel rm){
        RecipesDTO rDTO = new RecipesDTO();
        rDTO.setId(rm.getId());
        return rDTO;
    }
}
