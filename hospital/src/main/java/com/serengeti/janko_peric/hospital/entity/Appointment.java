package com.serengeti.janko_peric.hospital.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "starts_at")
    @NotNull
    private Timestamp startsAt;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @NotNull
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @NotNull
    private Patient patient;

    @OneToOne(mappedBy = "appointment")
    @JsonIgnore
    private ExaminationReport examinationReport;

    public Appointment() {
    }


    public Appointment(Timestamp startsAt, Doctor doctor, Patient patient, ExaminationReport examinationReport) {
        this.startsAt = startsAt;
        this.doctor = doctor;
        this.patient = patient;
        this.examinationReport = examinationReport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Timestamp startsAt) {
        this.startsAt = startsAt;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public ExaminationReport getExaminationReport() {
        return examinationReport;
    }

    public void setExaminationReport(ExaminationReport examinationReport) {
        this.examinationReport = examinationReport;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
