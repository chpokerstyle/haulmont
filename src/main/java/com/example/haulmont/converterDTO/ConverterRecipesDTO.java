package com.example.haulmont.converterDTO;


import com.example.haulmont.dto.RecipesDTO;
import com.example.haulmont.models.RecipeEntity;
import org.springframework.stereotype.Component;

@Component
public class ConverterRecipesDTO {
    public RecipeEntity fromRecipesDtoToRecipes(RecipesDTO rDTO){
    RecipeEntity rm = new RecipeEntity();
//    rm.setR_id(rDTO.getR_id());
//    rm.setDoctors_id(rDTO.getDoctors_id());
//    rm.setPatients_id(rDTO.getPatients_id());
//    rm.setDeadline(rDTO.getDeadline());
    rm.setDescription(rDTO.getDescription());
    rm.setPriority(rDTO.getPriority());
    return rm;
}
    public RecipesDTO fromRecipesToRecipesDTO(RecipeEntity rm){
        RecipesDTO rDTO = new RecipesDTO();
//        rDTO.setR_id(rm.getR_id());
//        rDTO.setDoctors_id(rm.getDoctors_id());
//        rDTO.setPatients_id(rm.getPatients_id());
        rDTO.setDescription(rm.getDescription());
//        rDTO.setDeadline(rm.getDeadline());
        rDTO.setPriority(rm.getPriority());
        return rDTO;
    }
}
