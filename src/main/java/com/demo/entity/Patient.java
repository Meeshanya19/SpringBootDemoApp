package com.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    private String patientFirstName;
    private String patientLastName;
    private LocalDate patientDateOfBirth;
    private String patientSex;
    private String patientCountry;
    private String patientState;
    private String patientAddress;


    @OneToMany(mappedBy = "patient")
    @Transient
    private List<PatientData> patientData;

    public Patient() {
    }

    public Patient(String patientAddress, String patientCountry, LocalDate patientDateOfBirth, String patientFirstName,
                   String patientLastName, String patientSex, String patientState) {
        this.patientAddress = patientAddress;
        this.patientCountry = patientCountry;
        this.patientDateOfBirth = patientDateOfBirth;
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientSex = patientSex;
        this.patientState = patientState;
    }

    public List<PatientData> getPatientData() {
        return patientData;
    }

    public void setPatientData(List<PatientData> patientData) {
        this.patientData = patientData;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientCountry() {
        return patientCountry;
    }

    public void setPatientCountry(String patientCountry) {
        this.patientCountry = patientCountry;
    }

    public LocalDate getPatientDateOfBirth() {
        return patientDateOfBirth;
    }

    public void setPatientDateOfBirth(LocalDate patientDateOfBirth) {
        this.patientDateOfBirth = patientDateOfBirth;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public String getPatientState() {
        return patientState;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }
}