package com.demo.serviceImpl;

import com.demo.repositories.PatientDataRepository;
import com.demo.entity.Patient;
import com.demo.entity.PatientData;
import com.demo.service.PatientDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PatientDataServiceImpl implements PatientDataService {
    @Autowired
    private PatientDataRepository patientDataRepository;
    @Autowired
    private PatientServiceImpl patientService;

    @Override
    public boolean savePatientData(int patientId, PatientData patientData) {
//        override
        try {
            Patient patient = patientService.getPatientById(patientId);
            patientDataRepository.saveAndFlush(patientData);
            patientData.setPatient(patient);
            patientDataRepository.save(patientData);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<PatientData> getPatientData(int patientId) {
        Patient patient = patientService.getPatientById(patientId);
        return patient.getPatientData();
    }

    @Override
    public void deletePatientData(int patientDataId) {
        patientDataRepository.deleteById(patientDataId);
    }

    @Override
    public PatientData getPatientDataByID(int patientDataId) {
        return patientDataRepository.findById(patientDataId)
                .orElseThrow(() -> new IllegalArgumentException("Patient data not found. Id: " + patientDataId));
    }

    @Override
    public PatientData editPatientData(PatientData data) {
        return patientDataRepository.save(data);
    }
}

