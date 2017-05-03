package com.example.cantri.doctoronline;

public class Illness {
    private String name;
    private String description;
    private String symptom;
    private String infection;

    public Illness() {
    }

    public Illness(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptom() {
        return this.symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getInfection() {
        return this.infection;
    }

    public void setInfection(String infection) {
        this.infection = infection;
    }
}
