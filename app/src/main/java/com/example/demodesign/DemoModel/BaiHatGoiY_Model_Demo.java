package com.example.demodesign.DemoModel;

public class BaiHatGoiY_Model_Demo {
    Integer imgBaiHat;
    String tvTenBaiHat;
    String tvTenCaSi;

    public BaiHatGoiY_Model_Demo() {
    }

    public BaiHatGoiY_Model_Demo(Integer imgBaiHat, String tvTenBaiHat, String tvTenCaSi) {
        this.imgBaiHat = imgBaiHat;
        this.tvTenBaiHat = tvTenBaiHat;
        this.tvTenCaSi = tvTenCaSi;
    }

    public Integer getImgBaiHat() {
        return imgBaiHat;
    }

    public void setImgBaiHat(Integer imgBaiHat) {
        this.imgBaiHat = imgBaiHat;
    }

    public String getTvTenBaiHat() {
        return tvTenBaiHat;
    }

    public void setTvTenBaiHat(String tvTenBaiHat) {
        this.tvTenBaiHat = tvTenBaiHat;
    }

    public String getTvTenCaSi() {
        return tvTenCaSi;
    }

    public void setTvTenCaSi(String tvTenCaSi) {
        this.tvTenCaSi = tvTenCaSi;
    }

    @Override
    public String toString() {
        return "BaiHatGoiY_Model_Demo{" +
                "imgBaiHat=" + imgBaiHat +
                ", tvTenBaiHat='" + tvTenBaiHat + '\'' +
                ", tvTenCaSi='" + tvTenCaSi + '\'' +
                '}';
    }
}
