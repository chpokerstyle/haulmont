package com.example.haulmont.servises;

import com.example.haulmont.dto.DoctorsDTO;
import com.example.haulmont.models.DoctorsModel;

public interface DoctorsService {
        DoctorsDTO saveDoctor(DoctorsDTO doctorsDTO);
        void deleteDoctor(Long d_id);
        DoctorsDTO editDoctor(DoctorsDTO doctorsDTO);
        Iterable<DoctorsModel> doctorsFindAll();
}
