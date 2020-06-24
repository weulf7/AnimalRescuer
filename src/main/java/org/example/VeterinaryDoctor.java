package org.example;

public class VeterinaryDoctor {
    private String name;
    private String specialization;

    //Optional properties
    private String treatmentType;
    private int treatmentPrice;
    private int treatmentTime;
    private boolean availability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public int getTreatmentPrice() {
        return treatmentPrice;
    }

    public void setTreatmentPrice(int treatmentPrice) {
        this.treatmentPrice = treatmentPrice;
    }

    public int getTreatmentTime() {
        return treatmentTime;
    }

    public void setTreatmentTime(int treatmentTime) {
        this.treatmentTime = treatmentTime;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
