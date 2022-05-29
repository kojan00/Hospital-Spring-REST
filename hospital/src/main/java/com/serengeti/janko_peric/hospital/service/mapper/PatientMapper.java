package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Patient;
import com.serengeti.janko_peric.hospital.service.dto.PatientDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PatientMapper extends EntityMapper<PatientDto, Patient> {

    @Named("patientOutput")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "fullName", source = "fullName")
    @Mapping(target = "age", source = "age")
    PatientDto toDtoPatientOutput(Patient patient);
}
