package day05_variables;

public class RecapVariable {
    public static void main(String[] args) {
        // declare variable
        byte numberOfCoffeeCup;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

        // we can't print the veriable because they don't have value

//        System.out.println(numberOfCoffeeCup);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentsInClass);

        // assign the value
        numberOfCoffeeCup = 2;
        totalPriceOfCoffee = 12.21;
        totalStudentsInClass = 543;

        System.out.println(numberOfCoffeeCup);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);

        // 2 * 543
        System.out.println(numberOfCoffeeCup+"*"+totalStudentsInClass);

        //Declare and assign

        double temperature = 20.6;
        int javaDays = 5;

        System.out.println();

        System.out.println(" This is my temperature: " + temperature);
        System.out.println(" It is day " + javaDays+ " in java class");




    }
}
