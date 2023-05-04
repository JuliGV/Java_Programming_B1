package day37_abstraction.car;

public class Garage {
    public static void main(String[] args) {
        // we can not createt an object because Car is abstract class
        //Car obj1 = new Car();
        Toyota t1 = new Toyota();
        t1.start();
        System.out.println();
        Honda h1 = new Honda();
        h1.start();
        System.out.println("=====");

        Tesla tes1 = new Tesla();
        tes1.start();
        tes1.charging();
        System.out.println("=====");
        Rivian r1 = new Rivian();
        r1.start();
        r1.charging();


    }
}
