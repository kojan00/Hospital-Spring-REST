package com.serengeti.janko_peric.hospital.dao;


import com.serengeti.janko_peric.hospital.entity.ExaminationReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminationReportRepo extends JpaRepository<ExaminationReport, Long> {
}
