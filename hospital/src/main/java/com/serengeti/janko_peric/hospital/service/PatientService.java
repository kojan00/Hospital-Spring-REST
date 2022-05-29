package com.serengeti.janko_peric.hospital.service;

import com.serengeti.janko_peric.hospital.entity.Medication;
import com.serengeti.janko_peric.hospital.entity.Patient;


import java.util.List;

public interface PatientService {
    String therapiesCount(long id);

    List<Medication> listOfMedicationsTaken(long id);
}
