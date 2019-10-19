package com.demo.serviceImpl;

import com.demo.repositories.PatientRepository;
import com.demo.entity.Patient;
import com.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Michail on 10/19/2019.
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient) {
//        add validation if needed
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void deletePatient(int patientId) {
        patientRepository.deleteById(patientId);
    }

    @Override
    public Patient getPatientById(int patientId) {
        return patientRepository.findById(patientId)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found. Id: " + patientId));
    }

    @Override
    public Patient editPatient(Patient patient) {
//        add validation if needed
        return patientRepository.save(patient);
    }
}
