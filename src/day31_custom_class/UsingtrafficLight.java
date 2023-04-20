package day31_custom_class;

public class UsingtrafficLight {
    public static void main(String[] args) {
        TrafficLight lightOne = new TrafficLight();
        lightOne.colour = "Red";// initializing
        System.out.println(lightOne.colour);

        // initializing by constructor
        TrafficLight lightTwo = new TrafficLight("Green");
        System.out.println(lightTwo.colour);

        TrafficLight lightThree = new TrafficLight("Yellow");
        System.out.println(lightThree.colour);

        TrafficLight lightFour = new TrafficLight();
        System.out.println(lightFour.colour);


    }
}

