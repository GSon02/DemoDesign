package com.example.demodesign.DemoModel;

public class CaSiHome_Model_Demo {
    Integer imgCaSiID;
    Integer imgCaSi;
    String TenCaSi;

    public CaSiHome_Model_Demo() {
    }

    public CaSiHome_Model_Demo(Integer imgCaSiID, Integer imgCaSi, String tenCaSi) {
        this.imgCaSiID = imgCaSiID;
        this.imgCaSi = imgCaSi;
        TenCaSi = tenCaSi;
    }

    public Integer getImgCaSiID() {
        return imgCaSiID;
    }

    public void setImgCaSiID(Integer imgCaSiID) {
        this.imgCaSiID = imgCaSiID;
    }

    public Integer getImgCaSi() {
        return imgCaSi;
    }

    public void setImgCaSi(Integer imgCaSi) {
        this.imgCaSi = imgCaSi;
    }

    public String getTenCaSi() {
        return TenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        TenCaSi = tenCaSi;
    }

    @Override
    public String toString() {
        return "CaSiHome_Model_Demo{" +
                "imgCaSiID=" + imgCaSiID +
                ", imgCaSi=" + imgCaSi +
                ", TenCaSi='" + TenCaSi + '\'' +
                '}';
    }
}
