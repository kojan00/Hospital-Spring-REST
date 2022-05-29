package com.serengeti.janko_peric.hospital.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoctorDto {

    @JsonProperty
    private long id;

    @JsonProperty
    private String fullName;

    @JsonProperty
    private int age;

    public DoctorDto() {
    }

    public DoctorDto(long id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
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
}
