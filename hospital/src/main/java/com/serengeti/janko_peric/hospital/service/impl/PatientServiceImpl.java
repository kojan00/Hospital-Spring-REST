package com.serengeti.janko_peric.hospital.service.impl;

import com.serengeti.janko_peric.hospital.dao.PatientRepo;
import com.serengeti.janko_peric.hospital.entity.Medication;
import com.serengeti.janko_peric.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public String therapiesCount(long id) {

        return "Patient with id: " + id + " has taken " + patientRepo.therapiesCount(id) + " therapies.";
    }

    @Override
    public List<Medication> listOfMedicationsTaken(long id) {
        return patientRepo.listOfMedicationsTaken(id);
    }
}
