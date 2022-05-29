package com.serengeti.janko_peric.hospital.entity;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "examination_report")
public class ExaminationReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description")
    @NotNull
    private String description;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "appointment_id", referencedColumnName = "id")
    @NotNull
    private Appointment appointment;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Therapy therapy;

    public ExaminationReport() {
    }

    public ExaminationReport(String description, Appointment appointment, Therapy therapy) {
        this.description = description;
        this.appointment = appointment;
        this.therapy = therapy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }
}
