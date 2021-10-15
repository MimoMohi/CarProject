package javabasic;

public class Engine {

    private String brand;
    private double horsePower;
    private byte displacementLiters;
    private float efficiencyPercent;


    public Engine(String brand, double horsePower, byte displacementLiters, float efficiencyPercent){
        this.brand = brand;
        this.horsePower = horsePower;
        this.displacementLiters = displacementLiters;
        this.efficiencyPercent = efficiencyPercent;
    }


    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setHorsePower(double horsePower){
        this.horsePower = horsePower;
    }
    public double getHorsePower(){
        return this.horsePower;
    }

    public void setDisplacementLiters(byte displacementLiters){
        this.displacementLiters = displacementLiters;
    }
    public byte getDisplacementLiters(){
        return this.displacementLiters;
    }

    public void setEfficiencyPercent(float efficiencyPercent){
        this.efficiencyPercent = efficiencyPercent;
    }
    public float getEfficiencyPercent(){
        return this.efficiencyPercent;
    }


    public String getDetails(){
        return brand + " " + horsePower + " " + displacementLiters + " " + efficiencyPercent;
    }

}
