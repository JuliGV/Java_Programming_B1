package day30_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal bird = new Animal();
        bird.population = 15435485L;
        bird.species = "Bird";

        System.out.println(bird);
        System.out.println(bird.toString());
    }

}
