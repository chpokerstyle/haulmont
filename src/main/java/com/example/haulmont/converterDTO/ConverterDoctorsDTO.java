package com.example.haulmont.converterDTO;

import com.example.haulmont.dto.DoctorsDTO;
import com.example.haulmont.models.DoctorsModel;
import org.springframework.stereotype.Component;

@Component
public class ConverterDoctorsDTO {
    public DoctorsModel fromDoctorsDtoToDoctors(DoctorsDTO dDTO){
        DoctorsModel dm = new DoctorsModel();
        dm.setdId(dDTO.getD_id());
        dm.setD_family(dDTO.getD_family());
        dm.setD_name(dDTO.getD_name());
        dm.setD_patronymic(dDTO.getD_patronymic());
        dm.setSpecialization(dDTO.getSpecialization());
        return dm;
    }
    public DoctorsDTO fromDoctorsToDoctorsDTO(DoctorsModel dm){
        DoctorsDTO dDTO = new DoctorsDTO();
        dDTO.setD_id(dm.getdId());
        dDTO.setD_family(dm.getD_family());
        dDTO.setD_name(dm.getD_name());
        dDTO.setD_patronymic(dm.getD_patronymic());
        dDTO.setSpecialization(dm.getSpecialization());
        return dDTO;
    }
}
