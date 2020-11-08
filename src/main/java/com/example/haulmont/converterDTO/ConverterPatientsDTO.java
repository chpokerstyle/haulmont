package com.example.haulmont.converterDTO;

import com.example.haulmont.dto.PatientsDTO;
import com.example.haulmont.models.PatientEntity;
import org.springframework.stereotype.Component;

@Component
public class ConverterPatientsDTO {
    public PatientEntity fromPatientsDtoToPatients(PatientsDTO pDTO){
        PatientEntity pm = new PatientEntity();
//        pm.setP_id(pDTO.getP_id());
//        pm.setP_name(pDTO.getP_name());
//        pm.setP_family(pDTO.getP_family());
//        pm.setP_patronymic(pDTO.getP_patronymic());
//        pm.setP_number(pDTO.getP_number());
        return pm;
    }
    public PatientsDTO fromPatientsToPatientsDTO(PatientEntity pm){
        PatientsDTO pDTO = new PatientsDTO();
//        pDTO.setP_id(pm.getP_id());
//        pDTO.setP_name(pm.getP_name());
//        pDTO.setP_family(pm.getP_family());
//        pDTO.setP_patronymic(pm.getP_patronymic());
//        pDTO.setP_number(pm.getP_number());
        return pDTO;
    }
}
