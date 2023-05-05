package day38_polymorphism.animal;

import day38_abstraction.language.Language;

public class Wild {
    public static void main(String[] args) {
        Lizard lz = new Lizard();
        lz.eat();

        lz.skinColour = "camo";
        lz.numOfClaws  = 10;
        lz.name = "Lizard";

        System.out.println(lz.skinColour);
        System.out.println(lz.numOfClaws);
        System.out.println(lz.name);
        System.out.println();

        // referens type ----> super class
        //referens    // object
        Reptile lz2 = new Lizard();

        lz2.eat();// it always run object side
        lz2.name = "Lizard2";
        lz2.numOfClaws = 20;
        //lz2.skinColour = "blue";

        Animal lz3 = new Lizard();
        lz3.eat();
        lz3.name = "Lizard2";
        //lz3.numOfClaws = 20;
        //lz2.skinColour = "blue";



    }
}
