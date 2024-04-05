package org.example.model;

public class HospitalBedInfo {
    private String bedId;
    private String bedType;
    private int bedChargesRate;


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

    public int getBedChargesRate() {
        return bedChargesRate;
    }

    public void setBedChargesRate(int bedChargesRate) {
        this.bedChargesRate = bedChargesRate;
    }

    @Override
    public String toString() {
        return "HospitalBedInfo{" +
                "bedId='" + bedId + '\'' +
                ", bedType='" + bedType + '\'' +
                ", bedChargesRate=" + bedChargesRate +
                '}';
    }
}
