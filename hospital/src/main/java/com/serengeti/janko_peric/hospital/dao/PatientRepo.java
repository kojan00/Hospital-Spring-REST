package com.serengeti.janko_peric.hospital.dao;

import com.serengeti.janko_peric.hospital.entity.Medication;
import com.serengeti.janko_peric.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

    @Query(value = "SELECT COUNT(*) " +
            "FROM patient p INNER JOIN " +
            "appointment a ON p.id = a.patient_id INNER JOIN " +
            "examination_report er ON a.id = er.appointment_id INNER JOIN " +
            "therapy t ON er.therapy_id = t.id " +
            "WHERE p.id = :id", nativeQuery = true)
    String therapiesCount(@Param("id") long id);

    @Query("SELECT t.medications " +
            "FROM Patient p INNER JOIN " +
            "Appointment a ON p.id = a.patient INNER JOIN " +
            "ExaminationReport er ON a.id = er.appointment INNER JOIN " +
            "Therapy t ON er.therapy = t.id " +
            "WHERE p.id = :id")
    List<Medication> listOfMedicationsTaken(@Param("id") long id);
}
