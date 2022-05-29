package com.serengeti.janko_peric.hospital.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.serengeti.janko_peric.hospital.entity.Medication;

import javax.persistence.*;
import java.util.Set;

public class TherapyDto {

    @JsonProperty
    private long id;

    @JsonProperty
    private String duration;

    @JsonProperty
    private String dose;

    @JsonProperty
    private Set<Medication> medications;

    public TherapyDto() {
    }

    public TherapyDto(long id, String duration, String dose, Set<Medication> medications) {
        this.id = id;
        this.duration = duration;
        this.dose = dose;
        this.medications = medications;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Set<Medication> getMedications() {
        return medications;
    }

    public void setMedications(Set<Medication> medications) {
        this.medications = medications;
    }
}
