package com.serengeti.janko_peric.hospital.controller;


import com.serengeti.janko_peric.hospital.entity.Medication;
import com.serengeti.janko_peric.hospital.entity.Patient;
import com.serengeti.janko_peric.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientRestController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/{id}/therapies")
    public String therapiesCount(@PathVariable long id) {
        return patientService.therapiesCount(id);
    }

    @GetMapping("/{id}/medications")
    public List<Medication> listOfMedicationsTaken(@PathVariable long id) {
        return patientService.listOfMedicationsTaken(id);
    }
}
