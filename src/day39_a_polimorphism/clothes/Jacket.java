package day39_a_polimorphism.clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wearing Jacket");

    }

    @Override
    public void putHoody() {
        System.out.println("Puting hoody on");

    }
}
