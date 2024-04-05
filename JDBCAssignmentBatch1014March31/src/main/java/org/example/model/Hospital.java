package org.example.model;

public class Hospital {
    private String hospitalId;
    private String hospitalName;

    public Hospital(String hospitalId, String hospitalName) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId='" + hospitalId + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                '}';
    }
}
