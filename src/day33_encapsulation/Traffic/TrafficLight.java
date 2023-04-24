package day33_encapsulation.Traffic;

import java.util.SplittableRandom;

public class TrafficLight {
    private String colour;
    public TrafficLight (String colour) {
        this.colour = colour;

    }
    public void setColour(String colour){
        if(colour.toLowerCase().equals(("yellow"))){
            this.colour = colour;
        }if(colour.toLowerCase().equals(("green"))){
            this.colour = colour;
        }if(colour.toLowerCase().equals(("red"))){
            this.colour = colour;
        }
    }

    public  String getColour(){
        return colour;
    }


}
