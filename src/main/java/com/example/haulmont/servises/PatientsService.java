package com.example.haulmont.servises;

import com.example.haulmont.dto.DoctorsDTO;
import com.example.haulmont.dto.PatientsDTO;
import com.example.haulmont.models.DoctorsModel;
import com.example.haulmont.models.PatientsModel;

public interface PatientsService {
    PatientsDTO savePatients(PatientsDTO patientsDTO);
    void deletePatients(Long p_id);
    PatientsDTO editPatients(PatientsDTO patientsDTO);
    Iterable<PatientsModel> patientsFindAll();
}
