package day10_if_statments;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter, 3 numbers.");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1+" is bigger one");
        }else if (num2>=num1 && num2>=num3){
            System.out.println(num2+" is biggest one");
        }else {
            System.out.println(num3+" is bigest one");
        }
    }

}
