package com.serengeti.janko_peric.hospital.controller;


import com.serengeti.janko_peric.hospital.entity.Therapy;
import com.serengeti.janko_peric.hospital.service.TherapyService;
import com.serengeti.janko_peric.hospital.service.dto.TherapyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/therapy")
public class TherapyRestController {

    @Autowired
    private TherapyService therapyService;


    @GetMapping("/all")
    private List<TherapyDto> allTherapies() {
        return therapyService.findAll();
    }

    @PostMapping("/add")
    private Therapy addTherapy(@RequestBody TherapyDto therapy) {
        return therapyService.save(therapy);
    }
}
