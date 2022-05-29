package com.serengeti.janko_peric.hospital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "medication")
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "brand", nullable = false)
    private String brand;

    @ManyToMany(mappedBy = "medications")
    @JsonIgnore
    private Set<Therapy> therapies;

    public Medication() {
    }

    public Medication(String name, String brand, Set<Therapy> therapies) {
        this.name = name;
        this.brand = brand;
        this.therapies = therapies;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Set<Therapy> getTherapies() {
        return therapies;
    }

    public void setTherapies(Set<Therapy> therapies) {
        this.therapies = therapies;
    }
}
