package com.example.demodesign.DemoModel;

public class Top_Thumbail_Model_Demo {
    Integer imgTop;
    String tvTenBaiHat;
    String tvTenCaSi;

    public Top_Thumbail_Model_Demo() {
    }

    public Top_Thumbail_Model_Demo(Integer imgTop, String tvTenBaiHat, String tvTenCaSi) {
        this.imgTop = imgTop;
        this.tvTenBaiHat = tvTenBaiHat;
        this.tvTenCaSi = tvTenCaSi;
    }

    public Integer getImgTop() {
        return imgTop;
    }

    public void setImgTop(Integer imgTop) {
        this.imgTop = imgTop;
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
        return "Top_Thumbail_Model_Demo{" +
                "imgTop=" + imgTop +
                ", tvTenBaiHat='" + tvTenBaiHat + '\'' +
                ", tvTenCaSi='" + tvTenCaSi + '\'' +
                '}';
    }
}
