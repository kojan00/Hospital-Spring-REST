package com.serengeti.janko_peric.hospital.dao;

import com.serengeti.janko_peric.hospital.entity.Therapy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapyRepo extends JpaRepository<Therapy, Long> {
}
