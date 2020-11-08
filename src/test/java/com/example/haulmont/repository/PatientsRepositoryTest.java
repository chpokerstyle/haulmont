package com.example.haulmont.repository;

import com.example.haulmont.models.PatientEntity;
import com.example.haulmont.repositories.PatientsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


// читай про Mockito

@DataJpaTest
public class PatientsRepositoryTest {

    @Autowired
    private PatientsRepository patientsRepository;

    @Test
    public void success_save_patient() {
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(1L);
        patientEntity.setFirstName("Testov");
        patientEntity.setSecondName("Test");
        patientEntity.setMiddleName("Testovich");
        patientEntity.setPhoneNumber("+79123456789");

        patientsRepository.save(patientEntity);

        Assertions.assertEquals(patientEntity, patientsRepository.findAll().iterator().next());
    }
}
