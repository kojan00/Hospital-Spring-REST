package com.serengeti.janko_peric.hospital.service.mapper;

import com.serengeti.janko_peric.hospital.entity.Appointment;
import com.serengeti.janko_peric.hospital.service.dto.AppointmentDto;
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
public class AppointmentMapperImpl implements AppointmentMapper {

    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public Appointment toEntity(AppointmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Appointment appointment = new Appointment();

        appointment.setId( dto.getId() );
        appointment.setStartsAt( dto.getStartsAt() );
        appointment.setDoctor( doctorMapper.toEntity( dto.getDoctor() ) );
        appointment.setPatient( patientMapper.toEntity( dto.getPatient() ) );

        return appointment;
    }

    @Override
    public List<Appointment> toEntity(List<AppointmentDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Appointment> list = new ArrayList<Appointment>( dtoList.size() );
        for ( AppointmentDto appointmentDto : dtoList ) {
            list.add( toEntity( appointmentDto ) );
        }

        return list;
    }

    @Override
    public List<AppointmentDto> toDto(List<Appointment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AppointmentDto> list = new ArrayList<AppointmentDto>( entityList.size() );
        for ( Appointment appointment : entityList ) {
            list.add( toDto( appointment ) );
        }

        return list;
    }

    @Override
    public AppointmentDto toDto(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentDto appointmentDto = new AppointmentDto();

        appointmentDto.setPatient( patientMapper.toDtoPatientOutput( appointment.getPatient() ) );
        appointmentDto.setDoctor( doctorMapper.toDtoDoctorOutput( appointment.getDoctor() ) );
        if ( appointment.getId() != null ) {
            appointmentDto.setId( appointment.getId() );
        }
        appointmentDto.setStartsAt( appointment.getStartsAt() );

        return appointmentDto;
    }

    @Override
    public AppointmentDto toDtoName(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentDto appointmentDto = new AppointmentDto();

        if ( appointment.getId() != null ) {
            appointmentDto.setId( appointment.getId() );
        }
        appointmentDto.setStartsAt( appointment.getStartsAt() );
        appointmentDto.setPatient( patientMapper.toDtoPatientOutput( appointment.getPatient() ) );
        appointmentDto.setDoctor( doctorMapper.toDtoDoctorOutput( appointment.getDoctor() ) );

        return appointmentDto;
    }
}
