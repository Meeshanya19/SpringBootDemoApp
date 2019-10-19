package com.demo.service;

import com.demo.entity.PatientData;

import java.util.List;

public interface PatientDataService {
    public boolean savePatientData(int patientId, PatientData patientData);

    public List<PatientData> getPatientData(int id);

    public void deletePatientData(int patientDataId);

    public PatientData getPatientDataByID(int patientDataId);

    public PatientData editPatientData(PatientData patientData);
}
