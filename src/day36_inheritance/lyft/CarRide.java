package day36_inheritance.lyft;

public class CarRide {
    public static void main(String[] args) {
        Lyft obj1 = new Lyft("Yuliia");
        System.out.println(obj1.calculate(50));

        LyftXL obj2 = new LyftXL("Oksana");
        System.out.println(obj2.calculate(50));



    }
}
