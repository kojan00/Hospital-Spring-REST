package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Medication;
import com.serengeti.janko_peric.hospital.entity.Therapy;
import com.serengeti.janko_peric.hospital.service.dto.TherapyDto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T12:38:23+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class TherapyMapperImpl implements TherapyMapper {

    @Override
    public Therapy toEntity(TherapyDto dto) {
        if ( dto == null ) {
            return null;
        }

        Therapy therapy = new Therapy();

        therapy.setId( dto.getId() );
        therapy.setDuration( dto.getDuration() );
        therapy.setDose( dto.getDose() );
        Set<Medication> set = dto.getMedications();
        if ( set != null ) {
            therapy.setMedications( new HashSet<Medication>( set ) );
        }

        return therapy;
    }

    @Override
    public TherapyDto toDto(Therapy entity) {
        if ( entity == null ) {
            return null;
        }

        TherapyDto therapyDto = new TherapyDto();

        therapyDto.setId( entity.getId() );
        therapyDto.setDuration( entity.getDuration() );
        therapyDto.setDose( entity.getDose() );
        Set<Medication> set = entity.getMedications();
        if ( set != null ) {
            therapyDto.setMedications( new HashSet<Medication>( set ) );
        }

        return therapyDto;
    }

    @Override
    public List<Therapy> toEntity(List<TherapyDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Therapy> list = new ArrayList<Therapy>( dtoList.size() );
        for ( TherapyDto therapyDto : dtoList ) {
            list.add( toEntity( therapyDto ) );
        }

        return list;
    }

    @Override
    public List<TherapyDto> toDto(List<Therapy> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TherapyDto> list = new ArrayList<TherapyDto>( entityList.size() );
        for ( Therapy therapy : entityList ) {
            list.add( toDto( therapy ) );
        }

        return list;
    }

    @Override
    public TherapyDto toDtoTherapyOutput(Therapy therapy) {
        if ( therapy == null ) {
            return null;
        }

        TherapyDto therapyDto = new TherapyDto();

        therapyDto.setId( therapy.getId() );
        therapyDto.setDuration( therapy.getDuration() );
        therapyDto.setDose( therapy.getDose() );
        Set<Medication> set = therapy.getMedications();
        if ( set != null ) {
            therapyDto.setMedications( new HashSet<Medication>( set ) );
        }

        return therapyDto;
    }
}
