package com.example.haulmont.servises;

import com.example.haulmont.converterDTO.ConverterDoctorsDTO;
import com.example.haulmont.dto.DoctorsDTO;
import com.example.haulmont.models.DoctorsModel;
import com.example.haulmont.repositories.DoctorsRepository;
import org.springframework.stereotype.Component;

@Component
public class DoctorsDefaultService implements DoctorsService {

    public final DoctorsRepository doctorsRepository;
    public final ConverterDoctorsDTO converterDoctorsDTO;
    public DoctorsDefaultService(DoctorsRepository doctorsRepository
                                ,ConverterDoctorsDTO converterDoctorsDTO) {
        this.doctorsRepository = doctorsRepository;
        this.converterDoctorsDTO = converterDoctorsDTO;
    }

    @Override
    public DoctorsDTO saveDoctor(DoctorsDTO doctorsDTO) {
        DoctorsModel saveDoctor = doctorsRepository.save(converterDoctorsDTO.fromDoctorsDtoToDoctors(doctorsDTO));
        return converterDoctorsDTO.fromDoctorsToDoctorsDTO(saveDoctor);
    }

    @Override
    public void deleteDoctor(Long d_id) {

    }

    @Override
    public DoctorsDTO editDoctor(DoctorsDTO doctorsDTO) {
        DoctorsModel editDoctor = doctorsRepository.save(converterDoctorsDTO.fromDoctorsDtoToDoctors(doctorsDTO));
        return converterDoctorsDTO.fromDoctorsToDoctorsDTO(editDoctor);
    }

    @Override
    public Iterable<DoctorsModel> doctorsFindAll() {
        return doctorsRepository.findAll();
    }
}
