package com.serengeti.janko_peric.hospital.service.impl;

import com.serengeti.janko_peric.hospital.dao.ExaminationReportRepo;
import com.serengeti.janko_peric.hospital.entity.ExaminationReport;
import com.serengeti.janko_peric.hospital.service.ExaminationReportService;
import com.serengeti.janko_peric.hospital.service.dto.ExaminationReportDto;
import com.serengeti.janko_peric.hospital.service.mapper.ExaminationReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminationReportServiceImpl implements ExaminationReportService {

    @Autowired
    private ExaminationReportRepo examinationReportRepo;

    @Autowired
    private ExaminationReportMapper examinationReportMapper;

    public ExaminationReportServiceImpl(ExaminationReportMapper examinationReportMapper) {
        this.examinationReportMapper = examinationReportMapper;
    }

    @Override
    public List<ExaminationReportDto> findAll() {
        List<ExaminationReportDto> examinationReportDtos = examinationReportMapper.toDto(examinationReportRepo.findAll());
        return examinationReportDtos;
    }

    @Override
    public ExaminationReport save(ExaminationReportDto examinationReportDto) {
        ExaminationReport examinationReport = examinationReportMapper.toEntity(examinationReportDto);
        return examinationReportRepo.save(examinationReport);
    }
}
