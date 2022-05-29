package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.ExaminationReport;
import com.serengeti.janko_peric.hospital.service.dto.ExaminationReportDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T12:38:23+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class ExaminationReportMapperImpl implements ExaminationReportMapper {

    @Autowired
    private AppointmentMapper appointmentMapper;
    @Autowired
    private TherapyMapper therapyMapper;

    @Override
    public ExaminationReport toEntity(ExaminationReportDto dto) {
        if ( dto == null ) {
            return null;
        }

        ExaminationReport examinationReport = new ExaminationReport();

        examinationReport.setId( dto.getId() );
        examinationReport.setDescription( dto.getDescription() );
        examinationReport.setAppointment( appointmentMapper.toEntity( dto.getAppointment() ) );
        examinationReport.setTherapy( therapyMapper.toEntity( dto.getTherapy() ) );

        return examinationReport;
    }

    @Override
    public List<ExaminationReport> toEntity(List<ExaminationReportDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ExaminationReport> list = new ArrayList<ExaminationReport>( dtoList.size() );
        for ( ExaminationReportDto examinationReportDto : dtoList ) {
            list.add( toEntity( examinationReportDto ) );
        }

        return list;
    }

    @Override
    public List<ExaminationReportDto> toDto(List<ExaminationReport> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ExaminationReportDto> list = new ArrayList<ExaminationReportDto>( entityList.size() );
        for ( ExaminationReport examinationReport : entityList ) {
            list.add( toDto( examinationReport ) );
        }

        return list;
    }

    @Override
    public ExaminationReportDto toDto(ExaminationReport examinationReport) {
        if ( examinationReport == null ) {
            return null;
        }

        ExaminationReportDto examinationReportDto = new ExaminationReportDto();

        examinationReportDto.setAppointment( appointmentMapper.toDtoName( examinationReport.getAppointment() ) );
        examinationReportDto.setTherapy( therapyMapper.toDtoTherapyOutput( examinationReport.getTherapy() ) );
        examinationReportDto.setId( examinationReport.getId() );
        examinationReportDto.setDescription( examinationReport.getDescription() );

        return examinationReportDto;
    }
}
