package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Appointment;
import com.serengeti.janko_peric.hospital.entity.ExaminationReport;
import com.serengeti.janko_peric.hospital.service.dto.AppointmentDto;
import com.serengeti.janko_peric.hospital.service.dto.ExaminationReportDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses={AppointmentMapper.class, TherapyMapper.class})
public interface ExaminationReportMapper  extends EntityMapper<ExaminationReportDto, ExaminationReport> {

    @Mapping(target = "appointment", source = "appointment", qualifiedByName = "name")
    @Mapping(target = "therapy", source = "therapy", qualifiedByName = "therapyOutput")
    ExaminationReportDto toDto(ExaminationReport examinationReport);

}
