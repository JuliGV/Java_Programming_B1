package day12_swwich_statment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//
//        System.out.println("Enter first number");
//        double number = input.nextDouble();
//
//        System.out.println("Enter operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\t Enter: ");
//        String operator = input.next();
//
//        System.out.println("Enter second number");
//        double number2 = input.nextDouble();
//
//        double result = 0.0;
//        boolean isValidOperator = true;
//
//
//
//        switch (operator){
//            case "+":
//                result = number + number2;
//                break;
//            case "-":
//                if (number>number2){
//
//                    result = number - number2;
//                }  else  {
//
//                result = number2 - number;
//
//            }
//
//            case "*":
//                result = number*number2;
//            case "/":
//                if (number2!=0){
//                    result = number/number2;
//                }else {
//                    System.out.println("We cant divide by 0");
//                }
//                break;
//            case"%":
//
//                if (number2!=0){
//                    result = number%number2;
//                }else {
//                    System.out.println("We cant divide by 0");
//                }
//                break;
//            default:
//                System.out.println("Operator invalid");
//                isValidOperator = false;
//
//        }
//        if (isValidOperator){
//            System.out.println(number+""+operator+""+number2+" = "+result);
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double numbOne = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        double numbTwo = input.nextDouble();

        System.out.print("Select operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\t Enter: ");
        String operator = input.next();

        boolean isValidOperator = true;

        double result=0;

        switch (operator){

            case "+":
                result = numbOne + numbTwo;
                break;
            case "-":
                // if numOne  > numTwo ---- > numOne - numTwo
                // else numTwo - NumOne
                if (numbOne > numbTwo) {
                    result = numbOne - numbTwo;
                } else {
                    result = numbTwo - numbOne;
                }
                break;
            case "*":
                result = numbOne * numbTwo;
                break;
            case "/":
                // 4/0 --- > not ok
                // 0/4 --- > ok
                if (numbTwo != 0) {
                    result = numbOne / numbTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            case "%":
                // 4/0 --- > not ok
                // 0/4 --- > ok
                if (numbTwo != 0) {
                    result = numbOne % numbTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            default:
                System.out.println(operator + " is not a valid for this calculator");
                isValidOperator = false;
        }

        if (isValidOperator) {
            System.out.println(numbOne + " " + operator + " " + numbTwo + " = " + result);
        }



    }
}
