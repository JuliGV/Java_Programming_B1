package day09_Scanner;
import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        /*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */
         // user to enter 3 angle numbers

        System.out.println("Enter tree angle numbers");

        double degreeOne = input.nextDouble(),
                degreeTwo = input.nextDouble(),
                degreeThree = input.nextDouble();

        // for triangle ---> total degree of inner calculation
        // calculate what is the total of 3 numbers
        double total = degreeOne+degreeTwo+degreeThree;

        // write statments that print if it is triangle



        System.out.println("It is triangle: "+ (total ==180));

        // write statments that print if it is circle

        System.out.println("It is circle: "+ (total ==360));

        // write a print statement that print either trianger or cicre

        System.out.println("This is triangle or cicre "+ (total==180 || total==360));



    }

}
