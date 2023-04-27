package day34_a_static.Computer;

public class Computer {
    String brand;
    double price;
    String colour;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static{
        System.out.println("Printing static block");
        hasScreen = false;
        hasBattery = true;
        hasMemory = false;
        //colour = "blue"; static acsepts only static
    }

    public Computer(String brand,double price,String colour){
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

}
