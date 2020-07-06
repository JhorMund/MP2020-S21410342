package com.multiplatform;

public class Bed {
    private String height;
    private String model;
    private String Long;
    private String wide;


    public Bed(String height, String model, String Long, String wide) {
        this.height = height;
        this.model = model;
        this.Long = Long;
        this.wide = wide;
    }

    public String getHeight() {
        return height;
    }

    public String getModel() {
        return model;
    }

    public String getLong(){
        return Long;
    }

    public String getWide() {
        return model;
    }

    public void Sleep(){
        System.out.println("Tempat untuk istirahat");
    }
}
