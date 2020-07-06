package com.multiplatform;

public class Fan {
    private String model;
    private String manufacture;
    private String Height;

    public Fan(String model, String manufacture, String Height) {
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

    public void Wind() {
        System.out.println("kena angin untuk di gantung");
    }
}
