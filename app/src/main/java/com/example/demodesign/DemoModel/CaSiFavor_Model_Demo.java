package com.example.demodesign.DemoModel;

public class CaSiFavor_Model_Demo{
    Integer imgCaSiID;
    String TenCaSi;

    public CaSiFavor_Model_Demo() {
    }

    public CaSiFavor_Model_Demo(Integer imgCaSiID, String tenCaSi) {
        this.imgCaSiID = imgCaSiID;
        TenCaSi = tenCaSi;
    }

    public Integer getImgCaSiID() {
        return imgCaSiID;
    }

    public void setImgCaSiID(Integer imgCaSiID) {
        this.imgCaSiID = imgCaSiID;
    }

    public String getTenCaSi() {
        return TenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        TenCaSi = tenCaSi;
    }

    @Override
    public String toString() {
        return "CaSiFavor_Model_Demo{" +
                "imgCaSiID=" + imgCaSiID +
                ", TenCaSi='" + TenCaSi + '\'' +
                '}';
    }
}
