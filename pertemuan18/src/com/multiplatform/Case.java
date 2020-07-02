package com.multiplatform;

public class Case {
    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        PowerSupply = powerSupply;
    }

    private String model;
    private String manufacturer;
    private String PowerSupply;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return PowerSupply;
    }
}