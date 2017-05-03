package com.example.cantri.doctoronline;

public class Appointment {
    private String key;
    private String request;
    private String clinic;
    private long time;

    public Appointment() {
    }

    public Appointment(String key, String request, String clinic, long time) {
        this.key = key;
        this.request = request;
        this.clinic = clinic;
        this.time = time;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
