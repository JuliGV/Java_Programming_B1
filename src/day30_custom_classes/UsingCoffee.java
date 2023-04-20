package day30_custom_classes;

import java.util.Collections;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffe1 = new Coffee();
        System.out.println(coffe1);
        System.out.println();
        coffe1.price = 3.98;
        coffe1.size = "M";
        coffe1.brand = "Coffee";
        coffe1.type = "Americano";

        System.out.println(coffe1);

        coffe1.drink();
        coffe1.refill(1.2);
    }
}
