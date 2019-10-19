package com.demo.controller;

import com.demo.entity.PatientData;
import com.demo.serviceImpl.PatientDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class PatientDataController {
    @Autowired
    PatientDataServiceImpl patientDataService;

    @PostMapping("create-record/{patientId}")
    public boolean savePatientData(@PathVariable("patientId") int patientId, @RequestBody PatientData patientData) {
        return patientDataService.savePatientData(patientId, patientData);
    }

    @GetMapping("get-record-list/{patientId}")
    public List<PatientData> getPatientData(@PathVariable("patientId") int patientId) {
        return patientDataService.getPatientData(patientId);
    }

    @GetMapping("record/{patientDataId}")
    public PatientData getPatientDataById(@PathVariable("patientDataId") int patientDataId) {
        return patientDataService.getPatientDataByID(patientDataId);
    }

    @DeleteMapping("delete-record/{patientDataId}")
    public void deletePatientData(@PathVariable("patientDataId") int patientDataId) {
        patientDataService.deletePatientData(patientDataId);
    }

    @PostMapping("update-record")
    public PatientData editPatientData(@RequestBody PatientData patientData) {
        return patientDataService.editPatientData(patientData);
    }
}
