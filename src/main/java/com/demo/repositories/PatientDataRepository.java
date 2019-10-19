package com.demo.repositories;

import com.demo.entity.PatientData;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientDataRepository extends JpaRepository<PatientData, Integer> {
}
