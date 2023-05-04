package day37_abstraction.car;

public class Rivian extends ElectricCar{

    @Override
    public void charging() {
        System.out.println("Rivian ig charging by bluthus");

    }

    @Override
    public void start() {
        System.out.println("Strarted by voice");

    }
}
