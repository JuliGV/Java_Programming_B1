package day31_custom_class;

public class Car {
    String model;
    int year;
    String colour;
    int fuelLevel;

    public String toString(){
        return "Car "+model+"\nModel "+year+"\ncolour "+colour+"\nFuel Level "+fuelLevel;
    }

    public void fillTank(){
        System.out.println("Filing tank");
        fuelLevel = 100;
    }
    public void fillTank(int level ) {
        System.out.println("Filing tank");
        fuelLevel = fuelLevel + level;
    }

}
