package com.example.haulmont.servises;

import com.example.haulmont.dto.PatientsDTO;
import com.example.haulmont.models.PatientEntity;

public interface PatientsService {
    PatientsDTO savePatients(PatientsDTO patientsDTO);
    void deletePatients(Long p_id);
    PatientsDTO editPatients(PatientsDTO patientsDTO);
    Iterable<PatientEntity> patientsFindAll();
}
