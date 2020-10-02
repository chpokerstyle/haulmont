package com.example.haulmont.controllers;

import com.example.haulmont.dto.PatientsDTO;
import com.example.haulmont.models.PatientsModel;
import com.example.haulmont.servises.PatientsDefaultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientsController {
    public final PatientsDefaultService patientsDefaultService;

    public PatientsController(PatientsDefaultService patientsDefaultService) {
        this.patientsDefaultService = patientsDefaultService;
    }

    @GetMapping("/")
    public Iterable<PatientsModel> allPatients(){
        return patientsDefaultService.patientsFindAll();
    }

    @PostMapping("/save")
    public PatientsDTO savePat(@RequestBody PatientsDTO patientsDTO){
        return patientsDefaultService.savePatients(patientsDTO);
    }
    @PutMapping("/edit")
    public PatientsDTO editPat(@RequestBody PatientsDTO patientsDTO){
        return patientsDefaultService.savePatients(patientsDTO);
    }

    @DeleteMapping("/delete/{id}")                                               // !!! ПОКА НЕ РАБОТАЕТ. ИСПРАВИТЬ !!!
    public ResponseEntity<Void> deletePat(@PathVariable Long id){
        patientsDefaultService.deletePatients(id);
        return ResponseEntity
                .ok()
                .build();   //нашёл в интернете такое решение. я не знаю, как это работает
    }
}
