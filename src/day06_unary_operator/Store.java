package day06_unary_operator;

public class Store {
    public static void main(String[] args) {

        String store = "target";
        int numberOfTv = 100;

        System.out.println("I have" + numberOfTv);


        System.out.println("Person come to the store and bought one TV");
        //numberOfTv = numberOfTv - 1; instead of this <---- we make this --->

        System.out.println("Number of TV left: " + --numberOfTv);

        System.out.println(" One customer put TV in the cart");
        System.out.println("Avaliabe TV in the store: " + numberOfTv--);
        System.out.println("A person that has a TV in the cart bought it");
        System.out.println("Now we have TV : " + numberOfTv);






    }
}
