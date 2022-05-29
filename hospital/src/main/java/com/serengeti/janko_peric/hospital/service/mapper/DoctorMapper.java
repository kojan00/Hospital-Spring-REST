package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Doctor;
import com.serengeti.janko_peric.hospital.service.dto.DoctorDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper extends EntityMapper<DoctorDto, Doctor> {

    @Named("doctorOutput")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "fullName", source = "fullName")
    DoctorDto toDtoDoctorOutput(Doctor doctor);
}
