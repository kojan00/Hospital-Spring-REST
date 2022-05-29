package com.serengeti.janko_peric.hospital.controller;


import com.serengeti.janko_peric.hospital.entity.ExaminationReport;
import com.serengeti.janko_peric.hospital.service.ExaminationReportService;
import com.serengeti.janko_peric.hospital.service.dto.ExaminationReportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examination-report")
public class ExaminationReportRestController {

    @Autowired
    private ExaminationReportService examinationReportService;


    @GetMapping("/all")
    public List<ExaminationReportDto> findAllReports() {
        return examinationReportService.findAll();
    }

    @PostMapping("/make-report")
    public ExaminationReport addReport(@RequestBody ExaminationReportDto examinationReportDto) {
        return examinationReportService.save(examinationReportDto);
    }
}
