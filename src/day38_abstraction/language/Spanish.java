package day38_abstraction.language;

public class Spanish implements Language{
    @Override
    public void hi() {
        System.out.println("Ola");

    }

    @Override
    public void bye() {
        System.out.println("Adios");

    }
}
