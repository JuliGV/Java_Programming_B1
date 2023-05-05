package day38_abstraction.animal;

import day38_abstraction.language.Language;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrot chews the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("Hello");

    }

    @Override
    public void bye() {

    }
}
