package day33_encapsulation.Traffic;

public class Traffic {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("yellow");
        System.out.println(light.getColour());
        TrafficLight light2 = new TrafficLight("grey");
        light2.setColour("red");
        System.out.println(light2.getColour());



    }
}
