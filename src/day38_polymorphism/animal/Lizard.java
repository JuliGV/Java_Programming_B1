package day38_polymorphism.animal;

public class Lizard extends Reptile{
    String skinColour;

    @Override
    public void eat() {
        System.out.println("Lizard is eating");
    }
}
