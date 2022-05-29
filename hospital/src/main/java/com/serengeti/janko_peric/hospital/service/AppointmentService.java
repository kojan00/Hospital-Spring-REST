package com.serengeti.janko_peric.hospital.service;

import com.serengeti.janko_peric.hospital.entity.Appointment;
import com.serengeti.janko_peric.hospital.service.dto.AppointmentDto;

import java.util.List;

public interface AppointmentService {
    List<AppointmentDto> findAll();
    Appointment save(AppointmentDto appointmentDto);
}
