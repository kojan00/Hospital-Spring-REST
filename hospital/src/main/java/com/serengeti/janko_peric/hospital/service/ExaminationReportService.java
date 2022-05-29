package com.serengeti.janko_peric.hospital.service;

import com.serengeti.janko_peric.hospital.entity.ExaminationReport;
import com.serengeti.janko_peric.hospital.service.dto.ExaminationReportDto;

import java.util.List;

public interface ExaminationReportService {
    List<ExaminationReportDto> findAll();
    ExaminationReport save(ExaminationReportDto examinationReportDto);
}
