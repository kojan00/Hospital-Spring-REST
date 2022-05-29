package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Appointment;
import com.serengeti.janko_peric.hospital.service.dto.AppointmentDto;
import jdk.jfr.Name;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses={DoctorMapper.class, PatientMapper.class})
public interface AppointmentMapper extends EntityMapper<AppointmentDto, Appointment> {

    @Mapping(target = "patient", source = "patient", qualifiedByName = "patientOutput")
    @Mapping(target = "doctor", source = "doctor", qualifiedByName = "doctorOutput")
    AppointmentDto toDto(Appointment appointment);


    @Named("name")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "startsAt", source = "startsAt")
    @Mapping(target = "patient", source = "patient", qualifiedByName = "patientOutput")
    @Mapping(target = "doctor", source = "doctor", qualifiedByName = "doctorOutput")
    AppointmentDto toDtoName(Appointment appointment);


}
