package javabasic;

import java.math.BigDecimal;

public class Car {

    private String brand;
    private String model;
    private short productionYear;
    private double fuelAmountLiters;
    private double fuelConsumptionPerKm;
    private double distanceTraveledKm;
    private int maximumSpeedKmH;
    private double weightKg;
    private boolean isAutomatic;
    private BigDecimal priceBgn;
    private CarColor color;
    private Accumulator accumulator;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires;


    public Car(Accumulator accumulator, Engine engine, Cargo cargo){
        this.tires = new Tire[4];

        this.accumulator = accumulator;
        this.engine = engine;
        this.cargo = cargo;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(short productionYear) {
        this.productionYear = productionYear;
    }

    public void setFuelAmountLiters(double fuelAmountLiters) {
        this.fuelAmountLiters = fuelAmountLiters;
    }

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public void setDistanceTraveledKm(double distanceTraveledKm) {
        this.distanceTraveledKm = distanceTraveledKm;
    }

    public void setMaximumSpeedKmH(int maximumSpeedKmH) {
        this.maximumSpeedKmH = maximumSpeedKmH;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public void setPriceBgn(BigDecimal priceBgn) {
        this.priceBgn = priceBgn;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }




    public void setTopLeftTire(Tire tire){
        this.tires[0] = tire;
    }

    public void setTopRightTire(Tire tire){
        this.tires[1] = tire;
    }

    public void setBottomLeftTire(Tire tire){
        this.tires[2] = tire;
    }

    public void setBottomRightTire(Tire tire){
        this.tires[3] = tire;
    }

    public void drive(double distanceKm){
        double fuelNeeded = distanceKm * this.fuelConsumptionPerKm;
        boolean isFuelEnough = this.fuelAmountLiters >= fuelNeeded;

        if (isFuelEnough){
            this.distanceTraveledKm +=distanceKm;
        }

    }

    public String getDetails(){
        String output = "Brand: " + this.brand + "\n";
        output += "Model: " + this.model + "\n";
        output += "Production Year: " + this.productionYear + "\n";
        output += "Fuel amount liters: " + this.fuelAmountLiters + "\n";
        output += "Fuel consumption liters: " + this.fuelConsumptionPerKm + "\n";
        output += "Distance traveled Km: " + this.distanceTraveledKm + "\n";
        output += "Max Speed Km/H: " + this.maximumSpeedKmH + "\n";
        output += "Weight Kg: " + this.weightKg + "\n";
        output += "Is Automatic: " + this.isAutomatic + "\n";
        output += "Price BGN: " + this.priceBgn + "\n";
        output += "Color: " + this.color + "\n";
        output += this.accumulator.getDetails() + "\n";
        output += this.cargo.getDetails() + "\n";
        output += this.engine.getDetails() + "\n";

        for (int index = 0; index < this.tires.length; index++) {
            output += this.tires[index].getDetails() + "\n";
        }

        return output;
    }

}
