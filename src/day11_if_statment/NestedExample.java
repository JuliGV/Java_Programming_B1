package day11_if_statment;

import java.util.Scanner;

public class NestedExample {
    /*
    ask a num from user
    if num is between 1 and 10 -->when check if it is even or odd

    else
      num not in the range
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        if (number>=0 && number<=10){// outer if condition

            if (number%2==0){// inner if condition
                System.out.println("The number is a even");
            }else {
                System.out.println("The number is odd");
            }

        }else{
            System.out.println("Number is not in the range");
        }
    }

}
