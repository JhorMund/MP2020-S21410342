package com.multiplatform;

public class Pillow {
    private String height;
    private String high;
    private String model;

    public Pillow(String height, String high, String model) {
        this.height = height;
        this.high = high;
        this.model = model;
    }

    public String getHeight() {
        return height;
    }

    public String getHigh() {
        return high;
    }

    public String getModel() {
        return model;
    }

    public void Relax() {
        System.out.println("Bantal untuk di kepala");

    }
}
