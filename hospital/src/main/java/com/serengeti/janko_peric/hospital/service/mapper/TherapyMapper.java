package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Therapy;
import com.serengeti.janko_peric.hospital.service.dto.TherapyDto;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface TherapyMapper extends EntityMapper<TherapyDto, Therapy> {

    @Named("therapyOutput")
    TherapyDto toDtoTherapyOutput(Therapy therapy);
}
