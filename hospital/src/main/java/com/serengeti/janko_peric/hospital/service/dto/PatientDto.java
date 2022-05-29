package com.serengeti.janko_peric.hospital.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PatientDto {

    @JsonProperty
    private long id;

    @JsonProperty
    private String fullName;

    @JsonProperty
    private int age;

    @JsonProperty
    private String address;

    public PatientDto() {
    }

    public PatientDto(long id, String fullName, int age, String address) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
