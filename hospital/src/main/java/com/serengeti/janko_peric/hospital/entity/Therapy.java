package com.serengeti.janko_peric.hospital.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "therapy")
public class Therapy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "duration", nullable = false)
    private String duration;

    @Column(name = "dose", nullable = false)
    private String dose;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "therapy_medication",
                joinColumns = @JoinColumn(name = "therapy_id", nullable = false),
                inverseJoinColumns = @JoinColumn(name = "medication_id", nullable = false))
    private Set<Medication> medications;

    public Therapy() {
    }

    public Therapy(String duration, String dose, Set<Medication> medications) {
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
