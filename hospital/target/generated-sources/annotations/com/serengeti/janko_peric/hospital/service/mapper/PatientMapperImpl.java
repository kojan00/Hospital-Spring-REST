package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Patient;
import com.serengeti.janko_peric.hospital.service.dto.PatientDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T12:38:23+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public Patient toEntity(PatientDto dto) {
        if ( dto == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setId( dto.getId() );
        patient.setFullName( dto.getFullName() );
        patient.setAge( dto.getAge() );
        patient.setAddress( dto.getAddress() );

        return patient;
    }

    @Override
    public PatientDto toDto(Patient entity) {
        if ( entity == null ) {
            return null;
        }

        PatientDto patientDto = new PatientDto();

        patientDto.setId( entity.getId() );
        patientDto.setFullName( entity.getFullName() );
        patientDto.setAge( entity.getAge() );
        patientDto.setAddress( entity.getAddress() );

        return patientDto;
    }

    @Override
    public List<Patient> toEntity(List<PatientDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Patient> list = new ArrayList<Patient>( dtoList.size() );
        for ( PatientDto patientDto : dtoList ) {
            list.add( toEntity( patientDto ) );
        }

        return list;
    }

    @Override
    public List<PatientDto> toDto(List<Patient> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PatientDto> list = new ArrayList<PatientDto>( entityList.size() );
        for ( Patient patient : entityList ) {
            list.add( toDto( patient ) );
        }

        return list;
    }

    @Override
    public PatientDto toDtoPatientOutput(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientDto patientDto = new PatientDto();

        patientDto.setId( patient.getId() );
        patientDto.setFullName( patient.getFullName() );
        patientDto.setAge( patient.getAge() );

        return patientDto;
    }
}
