package javabasic;

public class Tire {

    private String brand;
    private float pressure;
    private byte age;


    public Tire(String brand, float pressure, byte age){
        this.brand = brand;
        this.pressure = pressure;
        this.age = age;
    }


    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setPressure(float pressure){
        this.pressure = pressure;
    }
    public float getPressure(){
        return this.pressure;
    }

    public void setAge(byte age){
        this.age = age;
    }
    public byte getAge(){
        return this.age;
    }


    public String getDetails(){
        return brand + " " + pressure + " " + age;
    }


}
