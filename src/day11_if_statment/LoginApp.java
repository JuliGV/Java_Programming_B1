package day11_if_statment;

import java.util.Scanner;

public class LoginApp {
    /*
inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
example expected:
    pin: 1552
    ssn: 1234

outputs:

when the pincode and ssn match the expected print:
    Authentication successful

when the pincode or ssn are not correct print:
    Authentication failed

when the pincode was not correct print:
    incorrect pin code

when the ssn is not correct print:
    invalid ssn
 */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter 4 didgit pin code");
        int userPinCode = input.nextInt();

        System.out.println("Enter your last 4SSN digits: ");
        int userSnnDigits = input.nextInt();

        int correctPin = 1234;
        int correctSnnDigits = 4321;

        if (userPinCode==correctPin && userSnnDigits==correctSnnDigits) {
            System.out.println("Logged successfully");
        } else {
            System.out.println("Authentication failed");

        } if (userPinCode!=correctPin){
            System.out.println("Please enter correct pin");

        }if (userSnnDigits!=correctSnnDigits){
            System.out.println("Please enter valid SSN");
        }

    }
}
