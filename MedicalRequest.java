package com.example.cantri.doctoronline;

public class MedicalRequest {
    private String key;
    private String user;
    private String description;
    private String photoUrl;
    private long time;

    public MedicalRequest() {
    }

    public MedicalRequest(String key, String user, String description, String photoUrl, long time) {
        this.key = key;
        this.user = user;
        this.description = description;
        this.photoUrl = photoUrl;
        this.time = time;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
