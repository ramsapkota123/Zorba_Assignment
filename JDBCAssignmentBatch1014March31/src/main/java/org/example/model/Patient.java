package org.example.model;

public class Patient {
    private String patientId;
    private String patientName;
    private String patientType;
    private int noOfDays;
    private String bedId;
    private String bedType;
    private int totalBedCharges;



    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public int getTotalBedCharges() {
        return totalBedCharges;
    }

    public void setTotalBedCharges(int totalBedCharges) {
        this.totalBedCharges = totalBedCharges;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", patientName='" + patientName + '\'' +
                ", patientType='" + patientType + '\'' +
                ", noOfDays=" + noOfDays +
                ", bedId='" + bedId + '\'' +
                ", bedType='" + bedType + '\'' +
                ", totalBedCharges=" + totalBedCharges +
                '}';
    }
}
