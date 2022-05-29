package com.serengeti.janko_peric.hospital.service;

import ch.qos.logback.core.joran.conditional.ThenOrElseActionBase;
import com.serengeti.janko_peric.hospital.entity.Therapy;
import com.serengeti.janko_peric.hospital.service.dto.TherapyDto;

import java.util.List;

public interface TherapyService {
    List<TherapyDto> findAll();
    Therapy save(TherapyDto therapy);
}
