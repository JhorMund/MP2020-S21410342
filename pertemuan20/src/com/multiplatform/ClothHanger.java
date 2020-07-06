package com.multiplatform;

public class ClothHanger {
    private String model;
    private String manufacture;
    private String Height;

    public ClothHanger(String model, String manufacture, String Height) {
        this.model = model;
        this.manufacture = manufacture;
        this.Height = Height;
    }
    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getHeight() {
        return Height;
    }

    public void Hanger() {
        System.out.println("Gantungan baju");
    }
}
