package com.example.haulmont.controllers;

import com.example.haulmont.dto.DoctorsDTO;
import com.example.haulmont.models.DoctorEntity;
import com.example.haulmont.servises.DoctorsDefaultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    public final DoctorsDefaultService doctorsDefaultService;

    public DoctorController(DoctorsDefaultService doctorsDefaultService) {
        this.doctorsDefaultService = doctorsDefaultService;
    }
    @PostMapping("/save")
    public DoctorsDTO saveDoc (@RequestBody DoctorsDTO doctorsDTO){
    return doctorsDefaultService.saveDoctor(doctorsDTO);
    }

    @DeleteMapping("/delete/{id}")                                               // !!! ПОКА НЕ РАБОТАЕТ. ИСПРАВИТЬ !!!
    public ResponseEntity<Void>deleteDoc(@PathVariable Long id){                 // или работает. Я хз, если честно...
    doctorsDefaultService.deleteDoctor(id);
        return ResponseEntity
                .ok()
                .build();   //нашёл в интернете такое решение. я не знаю, как это работает
    }

    @GetMapping("/")
    public Iterable<DoctorEntity> allDoc(){
        return doctorsDefaultService.doctorsFindAll();
    }

    @PutMapping("/edit")
    public DoctorsDTO editDoc (@RequestBody DoctorsDTO doctorsDTO){
        return doctorsDefaultService.saveDoctor(doctorsDTO);
    }

}
