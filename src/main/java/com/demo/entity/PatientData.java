package com.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class PatientData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate createDate;
    private String titleOfRecord;

    @Lob
    private String patientRecord;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public PatientData() {
    }

    public PatientData(LocalDate createDate, String patientRecord, String titleOfRecord) {
        this.createDate = createDate;
        this.patientRecord = patientRecord;
        this.titleOfRecord = titleOfRecord;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getTitleOfRecord() {
        return titleOfRecord;
    }

    public void setTitleOfRecord(String titleOfRecord) {
        this.titleOfRecord = titleOfRecord;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientRecord() {
        return patientRecord;
    }

    public void setPatientRecord(String patientRecord) {
        this.patientRecord = patientRecord;
    }
}
