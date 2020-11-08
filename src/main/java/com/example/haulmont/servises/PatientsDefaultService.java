package com.example.haulmont.servises;

import com.example.haulmont.converterDTO.ConverterPatientsDTO;
import com.example.haulmont.dto.PatientsDTO;
import com.example.haulmont.models.PatientEntity;
import com.example.haulmont.repositories.PatientsRepository;
import org.springframework.stereotype.Component;

@Component
public class PatientsDefaultService implements PatientsService {

   public final PatientsRepository patientsRepository;
   public final ConverterPatientsDTO converterPatientsDTO;

    public PatientsDefaultService(PatientsRepository patientsRepository, ConverterPatientsDTO converterPatientsDTO) {
        this.patientsRepository = patientsRepository;
        this.converterPatientsDTO = converterPatientsDTO;
    }

    @Override
    public PatientsDTO savePatients(PatientsDTO patientsDTO) {
        PatientEntity savePatientEntity = patientsRepository.save(converterPatientsDTO.fromPatientsDtoToPatients(patientsDTO));
        return converterPatientsDTO.fromPatientsToPatientsDTO(savePatientEntity);
    }

    @Override
    public void deletePatients(Long p_id) {

    }

    @Override
    public PatientsDTO editPatients(PatientsDTO patientsDTO) {
        PatientEntity editPatientEntity = patientsRepository.save(converterPatientsDTO.fromPatientsDtoToPatients(patientsDTO));
        return converterPatientsDTO.fromPatientsToPatientsDTO(editPatientEntity);
    }

    @Override
    public Iterable<PatientEntity> patientsFindAll() {
        return patientsRepository.findAll();
    }
}
