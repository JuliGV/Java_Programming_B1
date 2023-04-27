package day34_a_static.Computer;

public class ComputerLab {
    public static void main(String[] args) {
        //Computer comp1 = new Computer();// compile time exeption
        Computer comp1 = new Computer("Mac",1600.0,"red");
        System.out.println(comp1.colour);
        Computer comp2 = new Computer("Lenovo", 600.0,"Pink");
        System.out.println(comp2.colour);

        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasScreen);

        System.out.println(comp1.hasMemory);
        System.out.println(comp1.hasBattery);
        System.out.println(comp1.hasScreen);

        comp1.hasBattery = false;
        System.out.println("________________");
        System.out.println(comp1.hasMemory);
        System.out.println(comp1.hasBattery);
        System.out.println(comp1.hasScreen);




    }
}
