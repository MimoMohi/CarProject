package javabasic;

public class Accumulator {

    private String brand;
    private double power;
    private double widthCm;
    private double heightCm;
    private double lengthCm;

    public Accumulator(String brand, double power, double widthCm, double heightCm, double lengthCm){
        this.brand = brand;
        this.power = power;
        this.widthCm = widthCm;
        this.heightCm = heightCm;
        this.lengthCm = lengthCm;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setPower(double power){
        this.power = power;
    }
    public double getPower(){
        return this.power;
    }

    public void setWidthCm(double widthCm){
        this.widthCm = widthCm;
    }
    public double getWidthCm(){
        return this.widthCm;
    }

    public void setHeightCm(double heightCm){
        this.heightCm = heightCm;
    }
    public double getHeightCm(){
        return this.heightCm;
    }

    public void setLengthCm(double lengthCm){
        this.lengthCm = lengthCm;
    }
    public double getLengthCm(){
        return this.lengthCm;
    }


    public String getDetails(){
        return brand + " " + power + " " + widthCm + " " + heightCm + " " + lengthCm;
    }

}
