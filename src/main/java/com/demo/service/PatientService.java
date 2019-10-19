package com.demo.service;

import com.demo.entity.Patient;

import java.util.List;

public interface PatientService {
    public Patient savePatient(Patient patient);

    public List<Patient> getPatients();

    public void deletePatient(int patientId);

    public Patient getPatientById(int patientId);

    public Patient editPatient(Patient patient);
}
