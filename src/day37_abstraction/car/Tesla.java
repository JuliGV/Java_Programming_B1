package day37_abstraction.car;

public class Tesla extends ElectricCar{
    @Override
    public void start() {
        System.out.println("Tesla started by card");

    }

    @Override
    public void charging() {
        System.out.println("Tesla charging by plugin");

    }
}
