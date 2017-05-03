package com.example.cantri.doctoronline;

public class ExaminationRecord {
    private String key;
    private String request;
    private String diagnosis;
    private String description;

    public ExaminationRecord() {
    }

    public ExaminationRecord(String key, String request, String diagnosis, String description) {
        this.key = key;
        this.request = request;
        this.diagnosis = diagnosis;
        this.description = description;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
