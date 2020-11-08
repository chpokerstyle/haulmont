package com.example.haulmont.converterDTO;


import com.example.haulmont.dto.RecipesDTO;
import com.example.haulmont.models.RecipesModel;
import org.springframework.stereotype.Component;

@Component
public class ConverterRecipesDTO {
    public RecipesModel fromRecipesDtoToRecipes(RecipesDTO rDTO){
    RecipesModel rm = new RecipesModel();
    rm.setR_id(rDTO.getR_id());
    rm.setDoctors_id(rDTO.getDoctors_id());
    rm.setPatients_id(rDTO.getPatients_id());
    rm.setDeadline(rDTO.getDeadline());
    rm.setDescription(rDTO.getDescription());
    rm.setPriority(rDTO.getPriority());
    return rm;
}
    public RecipesDTO fromRecipesToRecipesDTO(RecipesModel rm){
        RecipesDTO rDTO = new RecipesDTO();
        rDTO.setR_id(rm.getR_id());
        rDTO.setDoctors_id(rm.getDoctors_id());
        rDTO.setPatients_id(rm.getPatients_id());
        rDTO.setDescription(rm.getDescription());
        rDTO.setDeadline(rm.getDeadline());
        rDTO.setPriority(rm.getPriority());
        return rDTO;
    }
}
