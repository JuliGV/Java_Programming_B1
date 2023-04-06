package day24_method;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        sayHello();
        sayHelloto("Ilgar");
        sayHelloto("Parvana");
        sayHelloto("Yuliia");


        Scanner input = new Scanner (System.in);// use method with Scanner
        System.out.println("Put name");
        String userName = input.next();
        sayHelloto(userName);

    }


    public static void sayHello(){

        System.out.println("Hello Dariush. Hope all is well!");
    }

    public static void sayHelloto(String name){
        System.out.println("Hello "+ name+". Hope all is well!\"");
    }
}
