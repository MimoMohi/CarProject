package javabasic;

public class Automobile {

    private int plateNumber;
    private String model;
    private String color;
    private String engineNumber;

    public Automobile(int plateNumber, String model, String color, String engineNumber) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.color = color;
        this.engineNumber = engineNumber;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

}
