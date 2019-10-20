package com.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class PatientData  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientDataId;
    private LocalDate createDate;
    private String titleOfData;

    @Lob
    private String patientDataText;

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public int getPatientDataId() {
        return patientDataId;
    }

    public void setPatientDataId(int patientDataId) {
        this.patientDataId = patientDataId;
    }

    public String getPatientDataText() {
        return patientDataText;
    }

    public void setPatientDataText(String patientDataText) {
        this.patientDataText = patientDataText;
    }

    public String getTitleOfData() {
        return titleOfData;
    }

    public void setTitleOfData(String titleOfData) {
        this.titleOfData = titleOfData;
    }
}
