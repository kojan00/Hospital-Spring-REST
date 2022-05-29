package com.serengeti.janko_peric.hospital.service.impl;

import com.serengeti.janko_peric.hospital.dao.AppointmentRepo;
import com.serengeti.janko_peric.hospital.entity.Appointment;
import com.serengeti.janko_peric.hospital.service.AppointmentService;
import com.serengeti.janko_peric.hospital.service.dto.AppointmentDto;
import com.serengeti.janko_peric.hospital.service.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Autowired
    private AppointmentMapper appointmentMapper;


    @Override
    public List<AppointmentDto> findAll() {
        List<AppointmentDto> appointmentDtos = appointmentMapper.toDto(appointmentRepo.findAll());
        return appointmentDtos;
    }

    @Override
    public Appointment save(AppointmentDto appointmentDto) {
        Appointment appointment = appointmentMapper.toEntity(appointmentDto);
        appointment.setId(null);
        appointment = appointmentRepo.save(appointment);
        return appointment;
    }
}
