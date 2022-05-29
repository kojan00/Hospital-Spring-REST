package com.serengeti.janko_peric.hospital.controller;


import com.serengeti.janko_peric.hospital.entity.Appointment;
import com.serengeti.janko_peric.hospital.service.AppointmentService;
import com.serengeti.janko_peric.hospital.service.dto.AppointmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentRestController {

    @Autowired
    private AppointmentService appointmentService;


    @GetMapping("/all")
    private List<AppointmentDto> findAllAppointments() {
        return appointmentService.findAll();
    }

    @PostMapping("/make-appointment")
    private Appointment addAppointment(@RequestBody AppointmentDto appointmentDto) {
        return appointmentService.save(appointmentDto);
    }

}
