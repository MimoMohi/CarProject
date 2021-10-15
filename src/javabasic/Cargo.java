package javabasic;

public class Cargo {

    private String type;
    private float weight;


    public Cargo(String type, float weight){
        this.type = type;
        this.weight = weight;
    }


    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getWeight(){
        return this.weight;
    }


    public String getDetails(){
        return type + " " + weight;
    }

}
