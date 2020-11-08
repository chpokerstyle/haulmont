package com.example.haulmont.servises;

import com.example.haulmont.dto.DoctorsDTO;
import com.example.haulmont.models.DoctorEntity;

public interface DoctorsService {
        DoctorsDTO saveDoctor(DoctorsDTO doctorsDTO);
        void deleteDoctor(Long d_id);
        DoctorsDTO editDoctor(DoctorsDTO doctorsDTO);
        Iterable<DoctorEntity> doctorsFindAll();
}
