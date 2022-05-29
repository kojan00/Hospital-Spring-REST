package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Doctor;
import com.serengeti.janko_peric.hospital.service.dto.DoctorDto;
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
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public Doctor toEntity(DoctorDto dto) {
        if ( dto == null ) {
            return null;
        }

        Doctor doctor = new Doctor();

        doctor.setId( dto.getId() );
        doctor.setFullName( dto.getFullName() );
        doctor.setAge( dto.getAge() );

        return doctor;
    }

    @Override
    public DoctorDto toDto(Doctor entity) {
        if ( entity == null ) {
            return null;
        }

        DoctorDto doctorDto = new DoctorDto();

        doctorDto.setId( entity.getId() );
        doctorDto.setFullName( entity.getFullName() );
        doctorDto.setAge( entity.getAge() );

        return doctorDto;
    }

    @Override
    public List<Doctor> toEntity(List<DoctorDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Doctor> list = new ArrayList<Doctor>( dtoList.size() );
        for ( DoctorDto doctorDto : dtoList ) {
            list.add( toEntity( doctorDto ) );
        }

        return list;
    }

    @Override
    public List<DoctorDto> toDto(List<Doctor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DoctorDto> list = new ArrayList<DoctorDto>( entityList.size() );
        for ( Doctor doctor : entityList ) {
            list.add( toDto( doctor ) );
        }

        return list;
    }

    @Override
    public DoctorDto toDtoDoctorOutput(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        DoctorDto doctorDto = new DoctorDto();

        doctorDto.setId( doctor.getId() );
        doctorDto.setFullName( doctor.getFullName() );

        return doctorDto;
    }
}
