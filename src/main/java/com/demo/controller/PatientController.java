package com.demo.controller;

import com.demo.entity.Patient;
import com.demo.serviceImpl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class PatientController {
    @Autowired
    PatientServiceImpl patientService;

    @PostMapping("save-patient")
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping("patient-list")
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }

    @GetMapping("patient/{patientId}")
    public Patient getPatientById(@PathVariable("patientId") int patientId) {
        return patientService.getPatientById(patientId);
    }

    @DeleteMapping("delete-patient/{patientId}")
    public void deletePatient(@PathVariable("patientId") int patientId) {
        patientService.deletePatient(patientId);
    }

    @PostMapping("update-patient")
    public Patient editPatient(@RequestBody Patient patient) {
        return patientService.editPatient(patient);
    }
}
