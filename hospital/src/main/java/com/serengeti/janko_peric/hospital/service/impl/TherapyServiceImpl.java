package com.serengeti.janko_peric.hospital.service.impl;

import com.serengeti.janko_peric.hospital.dao.TherapyRepo;
import com.serengeti.janko_peric.hospital.entity.Therapy;
import com.serengeti.janko_peric.hospital.service.TherapyService;
import com.serengeti.janko_peric.hospital.service.dto.TherapyDto;
import com.serengeti.janko_peric.hospital.service.mapper.TherapyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TherapyServiceImpl implements TherapyService {

    @Autowired
    private TherapyRepo therapyRepo;

    @Autowired
    private TherapyMapper therapyMapper;

    @Override
    public List<TherapyDto> findAll() {
        List<TherapyDto> therapyDtos = therapyMapper.toDto(therapyRepo.findAll());
        return therapyDtos;
    }

    @Override
    public Therapy save(TherapyDto therapy) {
        Therapy therapyEntity = therapyMapper.toEntity(therapy);
        return therapyRepo.save(therapyEntity);
    }
}
