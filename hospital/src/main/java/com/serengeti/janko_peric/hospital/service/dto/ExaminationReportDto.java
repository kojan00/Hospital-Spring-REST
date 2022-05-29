package com.serengeti.janko_peric.hospital.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.serengeti.janko_peric.hospital.entity.Therapy;

public class ExaminationReportDto {

    @JsonProperty
    private long id;

    @JsonProperty
    private String description;

    @JsonProperty
    private AppointmentDto appointment;

    @JsonProperty
    private TherapyDto therapy;

    public ExaminationReportDto() {
    }

    public ExaminationReportDto(long id, String description, AppointmentDto appointment, TherapyDto therapy) {
        this.id = id;
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

    public AppointmentDto getAppointment() {
        return appointment;
    }

    public void setAppointment(AppointmentDto appointment) {
        this.appointment = appointment;
    }

    public TherapyDto getTherapy() {
        return therapy;
    }

    public void setTherapy(TherapyDto therapy) {
        this.therapy = therapy;
    }
}
