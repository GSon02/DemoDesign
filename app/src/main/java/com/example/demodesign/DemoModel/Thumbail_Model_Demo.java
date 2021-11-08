package com.example.demodesign.DemoModel;

public class Thumbail_Model_Demo {
    Integer imgThumbailID;

    public Thumbail_Model_Demo() {
    }

    public Thumbail_Model_Demo(Integer imgThumbailID) {
        this.imgThumbailID = imgThumbailID;
    }

    public Integer getImgThumbailID() {
        return imgThumbailID;
    }

    public void setImgThumbailID(Integer imgThumbailID) {
        this.imgThumbailID = imgThumbailID;
    }

    @Override
    public String toString() {
        return "Thumbail_Model_Demo{" +
                "imgThumbailID=" + imgThumbailID +
                '}';
    }
}
