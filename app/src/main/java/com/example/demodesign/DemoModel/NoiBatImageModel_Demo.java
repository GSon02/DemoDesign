package com.example.demodesign.DemoModel;

public class NoiBatImageModel_Demo {
    Integer imgID;
    Integer imgUrl;
    String Title;

    public NoiBatImageModel_Demo() {
    }

    public NoiBatImageModel_Demo(Integer imgID, Integer imgUrl, String title) {
        this.imgID = imgID;
        this.imgUrl = imgUrl;
        Title = title;
    }

    public Integer getImgID() {
        return imgID;
    }

    public void setImgID(Integer imgID) {
        this.imgID = imgID;
    }

    public Integer getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Integer imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "NoiBatImageModel_Demo{" +
                "imgID=" + imgID +
                ", imgUrl=" + imgUrl +
                ", Title='" + Title + '\'' +
                '}';
    }
}
