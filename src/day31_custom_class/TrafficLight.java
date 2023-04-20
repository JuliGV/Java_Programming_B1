package day31_custom_class;

public class TrafficLight {
    String colour;
    // This is constructors

    public TrafficLight(String trafficLight){
        colour = trafficLight;

    }
    // default constructor
    public  TrafficLight (){
        colour = "Yellow";// if we put values here all object
        // will be have the same colour

    }

}
