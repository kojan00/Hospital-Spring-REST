package com.serengeti.janko_peric.hospital.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.serengeti.janko_peric.hospital.entity.Doctor;
import com.serengeti.janko_peric.hospital.entity.ExaminationReport;
import com.serengeti.janko_peric.hospital.entity.Patient;

import java.sql.Timestamp;

public class AppointmentDto {

    @JsonProperty
    private long id;

    @JsonProperty
    private Timestamp startsAt;

    @JsonProperty
    private DoctorDto doctor;

    @JsonProperty
    private PatientDto patient;



    public AppointmentDto() {
    }

    public AppointmentDto(long id, Timestamp startsAt, DoctorDto doctor, PatientDto patient) {
        this.id = id;
        this.startsAt = startsAt;
        this.doctor = doctor;
        this.patient = patient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Timestamp startsAt) {
        this.startsAt = startsAt;
    }

    public DoctorDto getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorDto doctor) {
        this.doctor = doctor;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

}
